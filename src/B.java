public class B extends Marks {

    double biology;

    public B(double chemistry, double eng, double math, double biology) {

        super (chemistry, eng, math);
        this.biology = biology;
    }

    @Override
    double getPercentage() {
        return(chemistry + eng + math + biology) / 4;
    }
}
