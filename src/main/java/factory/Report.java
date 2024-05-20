package factory;

public class Report implements Document {
    @Override
    public void generate() {
        System.out.println("Generating Reports");
    }
}
