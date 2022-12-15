public class Singleton {
    private static Singleton singleton=new Singleton();
    private int id;
    private static int count=0;
    private Singleton(){
        System.out.println("Nesne oluşturuldu.");
    }
    public static Singleton getSingleton() {
        count++;
        System.out.println(count);
        return singleton;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
