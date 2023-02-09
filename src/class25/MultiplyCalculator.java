package class25;

public class MultiplyCalculator {

    private void multiplyCalc(int num1, int num2) {

        System.out.println(num1*num2);
    }

    private void multiplyCalc(int num1, int num2, int num3) {

        System.out.println(num1*num2*num3);
    }

    private void multiplyCalc(int num1, int num2, int num3, int num4) {

        System.out.println(num1*num2*num3*num4);
    }

    public static void main(String[] args) {
        MultiplyCalculator calculator=new MultiplyCalculator();

        calculator.multiplyCalc(2,3);
        calculator.multiplyCalc(3,4,5);
        calculator.multiplyCalc(6,7,8);
    }
}
