public class Circle implements Shape {


        double radius = 5;


    @Override
    public void calculateArea() {
        System.out.println("Area of the circle:" +radius * radius * 3.14);
    }

    @Override
    public void calculatePerimiter() {
        System.out.println("Perimeter of the circle:" +3.14 * 2 * radius);

    }
}
