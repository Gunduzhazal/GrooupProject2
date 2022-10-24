public class A extends Marks {

    public A(double chemistry, double eng, double math) {
        super(chemistry, eng, math);

    }

    @Override
    double getPercentage() {
        return (chemistry + eng + math)/3;
    }
}


