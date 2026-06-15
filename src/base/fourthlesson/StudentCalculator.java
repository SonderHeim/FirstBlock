package base.fourthlesson;

public class StudentCalculator {

    public static final double PI = 3.14;

    public static double calculateCircleArea(double radius) {
        double circleArea = PI * radius * radius;
        boolean isResult = true; // Переменная нигде не используется. По-хорошему её тогда нужно удалить.
        return circleArea;
    }

    public static void main(String[] args) {
        double myRadius = 5;
        System.out.println(calculateCircleArea(myRadius));
    }
}