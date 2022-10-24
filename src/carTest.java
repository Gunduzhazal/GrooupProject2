public class carTest {

    public static void main(String[] args) {
        Truck truck = new Truck();
        System.out.println("The final price of car with all discounts:" +truck.calculateSalePrice(15000, 1900));

        Sedan sedan = new Sedan();
        System.out.println("The final price of car with all discounts:" +sedan.calculateSalePrice(11000, 25));
    }
}
