public class testStudent {

    public static void main(String[] args) {
        Marks studentA = new A(22.5, 58.0, 69.0);
        System.out.println("This is the average score for student A:" +studentA.getPercentage());

        Marks studentB = new B(90.0, 76.0, 55.5, 79.0);
        System.out.println("This is the average score for student B:" +studentB.getPercentage());
    }
}
