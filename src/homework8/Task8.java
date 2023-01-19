package homework8;

public class Task8 {

    public static void main(String[] args) {

        /*
        Write a Java Program to print the first 10 numbers of Fibonacci series.
         */

        int n = 10, firstNumber = 0, secondNumber = 1;
        System.out.println("Fibonacci Series till " + n + " terms:");

        for (int i = 1; i <= n; ++i) {
            System.out.print(firstNumber + ", ");

            int nextNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = nextNumber;
        }

    }
}
