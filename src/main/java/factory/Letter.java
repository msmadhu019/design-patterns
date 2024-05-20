package factory;

public class Letter implements Document{
    @Override
    public void generate() {
        System.out.println("Generating Letters");
    }
}
