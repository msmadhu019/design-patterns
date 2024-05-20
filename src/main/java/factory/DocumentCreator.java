package factory;


public abstract class DocumentCreator {
    public abstract Document createDocument();

    public void generateDocument() {
        Document d = createDocument();
        System.out.println("Inside generating document method");
        d.generate();
    }
}
