public abstract class Marks {

    /*  We have to calculate the average of marks
    obtained in three subjects by student A and by
    student B. Create class 'Marks' with an abstract
    method 'getPercentage' that will be returning
    the average percentage of marks. Provide
    implementation of abstract method in classes
    'A' and 'B'. The constructor of student A takes the
    marks in three subjects as its parameters and
    the marks in four subjects as its parameters for
    student B. Test your code  */

    abstract double getPercentage();

    double chemistry;
    double eng;
    double math;

    public Marks(double chemistry, double eng, double math) {
        this.chemistry = chemistry;
        this.eng = eng;
        this.math = math;
    }
}


