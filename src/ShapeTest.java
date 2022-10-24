public class ShapeTest {

    public static void main(String[] args) {

        Shape [] shapes = {new Circle(), new Square()};

        for (Shape shape : shapes) {

            shape.calculateArea();
            shape.calculatePerimiter();
            System.out.println("**");

        }
    }
}
