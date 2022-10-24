public class Square implements Shape {

    int a = 3;

    @Override
    public void calculateArea() {
        System.out.println("Area of the square:" +a * a);
    }

    @Override
    public void calculatePerimiter() {
        System.out.println("Perimeter of the square:" +4 * a);

    }
}
