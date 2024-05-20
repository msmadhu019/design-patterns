package simple.factory;

public class ShapeFactory {
    public Shape createShape(String shape) {
        if ("circle".equalsIgnoreCase(shape)) {
            return new Circle();
        } else if ("rectangle".equalsIgnoreCase(shape)) {
            return new Rectangle();
        } else if ("square".equalsIgnoreCase(shape)) {
            return new Square();
        } else {
            System.out.println("Unknown Shape, Please try again");
        }
        return null;
    }
}
