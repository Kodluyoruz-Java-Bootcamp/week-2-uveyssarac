public class Mi8 implements Telefon{
    private String model="Mi 8";

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Mi8{" +
                "model='" + model + '\'' +
                '}';
    }
}
