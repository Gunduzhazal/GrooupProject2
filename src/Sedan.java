public class Sedan extends Car {

    int length;

    @Override
    double calculateSalePrice(double carPrice, int length) {
        if (length > 20) {
            salePrice = carPrice * 0.95;
        } else {
            salePrice = carPrice * 0.9;
        }
        return salePrice;
    }
}
