public class Main {
    public static void main(String[] args) {

        MiFabrika fabrika=new MiFabrika();
        Telefon tel= fabrika.telefonUret("mi8");
        System.out.println(tel);

        Telefon tel1= fabrika.telefonUret("minote10");
        System.out.println(tel1);

        Telefon tel2= fabrika.telefonUret("mi8");
        tel2.setModel("mi5");
        System.out.println(tel2);


        Telefon tel3= fabrika.telefonUret("minote10");
        tel3.setModel("minote2");
        System.out.println(tel3);


        //Factory design pattern'de nesnelerin kendi sınıflarından değilde
        //bir fabrikası varmışta ordan üretiliyormuş gibi üretilmesi sağlanır.
        //Bu şekilde üretilmesinin avantajı sürekli new keydordu ile üretmek zorunda kalmamamız.
        //Ve oluşturduğumuz interface ile direkt nesneyi o intereface üzerinden return edebilmemiz.
        //Dezavantaj olarak ise eğer çok fazla modelimiz olduğunu düşünürsek MiFabrika sınıfında çok fazla if bloğu gerekecektir.
        //Bu dezavantajdan kaynaklı çözüm olarak ise Abstract Factory Design pattern geliştirilmiştir.
        //Abstract Factory modelinde her telefon modeli için bir fabrika oluşturarak if bloklarından kurtulmuş oluruz.
        // Bir kodda ne kadar çok if varsa o kod o kadar kötüdür.
    }
}