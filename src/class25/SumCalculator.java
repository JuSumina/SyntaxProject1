package class25;

public class SumCalculator {

    static void sumCalc(int num1, int num2) {
        System.out.println(num1+num2);
    }

    static void sumCalc(int num1, int num2, int num3) {
        System.out.println(num1+num2);
    }

    static void sumCalc(int num1, int num2, int num3, int num4) {
        System.out.println(num1+num2);
    }

    public static void main(String[] args) {

        sumCalc(2,3);
        sumCalc(3,4,5);
        sumCalc(6,7,8);
    }
}
