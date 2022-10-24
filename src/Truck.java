public class Truck extends Car {

    int weight;

    @Override
    double calculateSalePrice(double carPrice, int weight) {
        if (weight > 2000) {
            salePrice = carPrice * 0.9;
        } else {
            salePrice = carPrice * 0.8;
        }
        return salePrice;
    }
}
