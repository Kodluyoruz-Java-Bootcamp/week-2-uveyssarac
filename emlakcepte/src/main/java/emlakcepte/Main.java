package emlakcepte;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import emlakcepte.model.Message;
import emlakcepte.model.Realty;
import emlakcepte.model.RealtyType;
import emlakcepte.model.User;
import emlakcepte.model.UserType;
import emlakcepte.service.RealtyService;
import emlakcepte.service.UserService;

public class Main {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConfig.class);

        ArrayList<Realty> pelinRealtyList = new ArrayList<>();
        ArrayList<Realty> samiRealtyList = new ArrayList<>();
        User userPelin = new User("Pelin", "mimar.pelin@gmail.com", "Pelin123", UserType.INDIVIDUAL, pelinRealtyList);
        User userSami = new User("Sami", "sami@gmail.com", "123", UserType.INDIVIDUAL, samiRealtyList);
        userPelin.setType(UserType.INDIVIDUAL);
        /*
         * UserService userService = UserService.getSameInstance();
         *
         * UserService userService1 = UserService.getSameInstance();
         *
         * UserService userService2 = UserService.getDifferentInstance();
         *
         * System.out.println(userService); System.out.println(userService1);
         * System.out.println(userService2);
         */

        // eski yöntem
        //UserService userService = new UserService();

        //Spring bizim yerime create ediyor
        UserService userService = applicationContext.getBean(UserService.class);

        userService.createUser(userPelin);
        userService.createUser(userSami);

        userService.printAllUser();

        System.out.println("-----");

        // userList.add(user);
        // userList.add(userPelin);

        // userList.forEach(usr -> System.out.println(usr.getName()));

        RealtyService realtyService = new RealtyService();

        Realty realty = new Realty(123L, "ZEKERİYAKÖY ' de 1200 M2 Satılık VİLLA", LocalDateTime.now(), userPelin, RealtyType.ACTIVE);
        realty.setProvince("İstanbul");
        realty.setDistrict("Beşiktaş");
        realtyService.createRealty(realty);

        Realty realty1 = new Realty();
        realty1.setNo(124L);
        realty1.setTitle("Büyükdere Ana Cadde üstünde 16.060 m2 kapalı alanlı PLAZA");
        realty1.setStatus(RealtyType.ACTIVE);
        realty1.setUser(userPelin);
        realty1.setProvince("İstanbul");
        realty1.setDistrict("Taksim");

        realtyService.createRealty(realty1);

        Realty realty2 = new Realty();
        realty2.setNo(12324L);
        realty2.setTitle("Karadolap mh.Makara sk. 150m2");
        realty2.setStatus(RealtyType.ACTIVE);
        realty2.setUser(userPelin);
        realty2.setProvince("İstanbul");
        realty2.setDistrict("Eyüp");

        realtyService.createRealty(realty2);

        Realty realty3 = new Realty();
        realty3.setNo(24L);
        realty3.setTitle("Kireçburnu Müstakil ev satılık");
        realty3.setStatus(RealtyType.ACTIVE);
        realty3.setUser(userSami);
        realty3.setProvince("İstanbul");
        realty3.setDistrict("Kireçburnu");

        realtyService.createRealty(realty3);

        Realty realty4 = new Realty();
        realty4.setNo(202L);
        realty4.setTitle("Kadiköy satılık apartman dairesi");
        realty4.setStatus(RealtyType.ACTIVE);
        realty4.setUser(userPelin);
        realty4.setProvince("İstanbul");
        realty4.setDistrict("Kadiköy");

        realtyService.createRealty(realty4);

        Realty realty5 = new Realty();
        realty5.setNo(85L);
        realty5.setTitle("Kadiköy ev 150m2");
        realty5.setStatus(RealtyType.PASSIVE);
        realty5.setUser(userPelin);
        realty5.setProvince("İzmir");
        realty5.setDistrict("Kadiköy");
        realtyService.createRealty(realty5);

        Realty realty6 = new Realty();
        realty6.setNo(232L);
        realty6.setTitle("Bağlarbaşı meydan satılık apartman dairesi 70m2");
        realty6.setStatus(RealtyType.PASSIVE);
        realty6.setUser(userPelin);
        realty6.setProvince("İstanbul");
        realty6.setDistrict("Bağlarbaşı");
        realtyService.createRealty(realty6);

        Realty realty7 = new Realty();
        realty7.setNo(78L);
        realty7.setTitle("Güneşli Kiralık daire 80m2");
        realty7.setStatus(RealtyType.PASSIVE);
        realty7.setUser(userPelin);
        realty7.setProvince("İstanbul");
        realty7.setDistrict("Güneşli");
        realtyService.createRealty(realty7);

        Realty realty8 = new Realty();
        realty8.setNo(10L);
        realty8.setTitle("SAtılık Plaza Nish İStanbul Çok Büyük ohoooo");
        realty8.setStatus(RealtyType.PASSIVE);
        realty8.setUser(userPelin);
        realty8.setProvince("Ankara");
        realty8.setDistrict("Yenibosna");
        realtyService.createRealty(realty8);

        Realty realty9 = new Realty();
        realty9.setNo(232L);
        realty9.setTitle("Güneşli satılık daire 80m2");
        realty9.setStatus(RealtyType.PASSIVE);
        realty9.setUser(userPelin);
        realty9.setProvince("İzmir");
        realty9.setDistrict("Güneşli");
        realtyService.createRealty(realty9);


        Realty favori1 = new Realty();
        favori1.setNo(125L);
        favori1.setTitle("KAVAKPINAR MAHALLESİNDE 2+1 80 M2 ARAKAT İSKANLI");
        favori1.setStatus(RealtyType.PASSIVE);
        favori1.setUser(userPelin);
        favori1.setProvince("Ankara");
        favori1.setDistrict("Kızılay");


        realtyService.createRealty(favori1);

        realty.setUser(userSami);
        //userSami.setRealtyList(List.of(realty, realty1));
        //userPelin.setRealtyList(List.of(realty1,realty2,realty));

        List<Realty> fovarilerim = new ArrayList<>();
        fovarilerim.add(favori1);
        userSami.setFavoriteRealtyList(fovarilerim);

        // sistemdeki bütün ilanlar

        System.out.println("---------------- Bütün ilanlar ---------------- ");

        realtyService.printAll(realtyService.getAll());

        // İstanbuldaki ilanların bulunması

        System.out.println("---------------- İstanbul'daki ilanlar ---------------- ");

        realtyService.getAllByProvince("İstanbul");

        //Şehir ve ilçe bazlı ilan arama.
        System.out.println("---------------- İstanbul Taksim'deki ilanlar ---------------- ");
        realtyService.getAllByProvinceDistrict("İstanbul", "Beşiktaş");

        System.out.println("---------------- İstanbul Beşiktaş'taki ilanlar ---------------- ");
        realtyService.getAllByProvinceDistrict("İstanbul", "Taksim");


        //Kullanıcı yaptığı aramaları kaydedebilmeli, listeleyebilmeli.

        System.out.println("---------------- Sami kullanıcısının aramaları ---------------- ");
        List<String> search1 = new ArrayList<>();
        search1.add("İstanbul");
        search1.add("Taksim");

        List<String> search2 = new ArrayList<>();
        search2.add("İstanbul");

        List<List<String>> searchList = new ArrayList<>();
        searchList.add(search1);
        searchList.add(search2);
        userSami.setSearchList(searchList);
        userService.printAllSearchingByUser(userSami);
        System.out.println("---------------- Pelin kullanıcısının yayında olan ilanları ---------------- ");
        System.out.println(userService.publishedRealtyNumber(userPelin));


        //Şehir Vitrini
        System.out.println("----------------  ŞEHİR VİTRİNİ ---------------- ");
        realtyService.createSehirVitrini();


        // Bir kullanıcının bütün ilanlarını listele
        System.out.println("---------------- Pelin kullanıcısının bütün ilanlarını listele ---------------- ");
        realtyService.printAll(realtyService.getAllByUserName(userPelin));

        System.out.println("---------------- Sami kullanıcısının bütün ilanlarını listele ---------------- ");
        realtyService.printAll(realtyService.getActiveRealtyByUserName(userSami));

        System.out.println("---------------- İstanbul, Ankara, İzmir şehirlerindeki ilanlarının sayısı  ---------------- ");

        System.out.println(realtyService.getNumberByProvince(List.of("istanbul", "izmir", "ankara")));




        /*
         * userList.forEach(usr -> {
         *
         * usr.getFavoriteRealtyList().forEach(favoriRealty ->
         * System.out.println(favoriRealty.getTitle()) );
         *
         * });
         */

        Message message = new Message("acil dönüş", "ilan ile ilgili bilgilendirme verebilir misiniz?", userPelin,
                userSami);

        userSami.setMessages(List.of(message));
        userPelin.setMessages(List.of(message));

        userSami.getMessages();


    }

    private static User prepareUser(String name, String email, String password) {
        User user = new User();
        user.setName(name);
        user.setMail(email);
        user.setPassword(password);
        user.setType(UserType.INDIVIDUAL);
        user.setCreateDate(LocalDateTime.now());
        return user;
    }

}
