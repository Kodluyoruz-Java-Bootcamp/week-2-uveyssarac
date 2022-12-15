public class MiNote10 implements Telefon {
    private String model = "Mi Note 10";

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "MiNote10{" +
                "model='" + model + '\'' +
                '}';
    }
}
