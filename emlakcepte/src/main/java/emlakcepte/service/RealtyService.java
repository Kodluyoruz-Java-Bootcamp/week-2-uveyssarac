package emlakcepte.service;

import emlakcepte.dao.RealtyDao;
import emlakcepte.model.Realty;
import emlakcepte.model.RealtyType;
import emlakcepte.model.User;
import emlakcepte.model.UserType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RealtyService {

    private RealtyDao realtyDao = new RealtyDao();

    @Autowired //injection
    private UserService userService = new UserService();

    public void createRealty(Realty realty) {

        //userService.printAllUser();
        //Kullanıcının biraysel kullanıcı olup olmadığı kontrolü
        if (UserType.INDIVIDUAL.equals(realty.getUser().getType())) {
            // en fazla 3 ilan girebilir.
            // Userservice'teki kullanıcıya ait active ilan sayısını bulup kontorlü sağlıyoruz.
            if (userService.publishedRealtyNumber(realty.getUser()) >= 3) {
                System.out.println("Bireysel kullanıclar en fazla 3 ilan yayınlayabilir.. (İlanın durumu Pasif olarak değiştirildi.)");
                realty.setStatus(RealtyType.PASSIVE);
                realtyDao.saveRealty(realty);
                realty.getUser().getRealtyList().add(realty);
            } else {//3'ten az active ilanı varsa yeni ilan eklenebilir.
                realtyDao.saveRealty(realty);
                System.out.println("createRealty :: " + realty.getUser().getName() + " :: " + realty.getTitle());
                realty.getUser().getRealtyList().add(realty);
            }

        }


    }

    public void createSehirVitrini() {
        int realtyNumber = 10;
        if (realtyDao.findAll().size() < 10) {
            realtyNumber = realtyDao.findAll().size();
        }
        for (int i = 0; i < realtyNumber; i++) {
            System.out.println(realtyDao.findAll().get(i).toString());
        }
    }

    public List<Realty> getAll() {
        return realtyDao.findAll();
    }

    public void printAll(List<Realty> realtList) {
        realtList.forEach(realty -> System.out.println(realty));
    }

    public void getAllByProvince(String province) {

        getAll().stream()
                .filter(realty -> realty.getProvince().equalsIgnoreCase(province))
                //.count();
                .forEach(realty -> System.out.println(realty));

    }

    public int getNumberByProvince(List<String> provinces) {
        List<Realty> rL = getAll();
        int count = 0;
        for (int i = 0; i < provinces.size(); i++) {
            for (int j = 0; j < rL.size(); j++) {
                if (provinces.get(i).equalsIgnoreCase(rL.get(j).getProvince())) {
                    count++;
                }
            }
        }
        return count;

    }


    public List<Realty> getAllByUserName(User user) {
        return getAll().stream()
                .filter(realty -> realty.getUser().getMail().equals(user.getMail()))
                .toList();
    }

    public List<Realty> getActiveRealtyByUserName(User user) {

        return getAll().stream()
                .filter(realty -> realty.getUser().getName().equals(user.getName()))
                .filter(realty -> RealtyType.ACTIVE.equals(realty.getStatus()))
                .toList();

    }

    // ------------------------------------ YENİ EKLENEN KISIM ------------------------------------
    public void getAllByProvinceDistrict(String province, String district) {
        getAll().stream()
                .filter(realty -> realty.getProvince().equals(province))
                .filter(realty -> realty.getDistrict().equals(district))
                //.count();
                .forEach(realty -> System.out.println(realty));
    }
    // ------------------------------------ YENİ EKLENEN KISIM ------------------------------------
}
