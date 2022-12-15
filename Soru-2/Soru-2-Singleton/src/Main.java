public class Main {
    public static void main(String[] args) {

        Singleton singleton = Singleton.getSingleton();
        Singleton singleton1 = Singleton.getSingleton();
        singleton.setId(1);
        System.out.println("1.nesnenin id'si : " + singleton.getId());
        singleton1.setId(2);
        System.out.println();
        System.out.println("1.nesnenin id'si : " + singleton.getId());
        System.out.println("2.nesnenin id'si : " + singleton1.getId());
        System.out.println();
        singleton.setId(1);
        System.out.println("1.nesnenin id'si : " + singleton.getId());
        System.out.println("2.nesnenin id'si : " + singleton1.getId());

        //Singleton design pattern ile sadece bir nesne oluşur.
        //Sınıf içindeki static değerler sınıfa aittir.
        //Örnekte görüldüğü üzere iki kere nesne oluşturulmuştur fakat,
        //sınıf içinde oluşturduğumuz static Singleton nesnesi tek sefer çalışır
        //bu yüzden constructor'a tek bir sefer girer. Ve önceden oluşturulmuş nesneyi geri döndürür.
        //Ve tekrardan örnekte görüldüğü üzere aynı nesne gibi davranmaktadırlar.
        //Birinin id'si değişince diğerininde değişmektedir.
    }
}

