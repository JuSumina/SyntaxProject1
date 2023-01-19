package homework8;

public class Task7 {

    public static void main(String[] args) {

        /*
        Write a java program to check whether a given number is prime or not?
         */

        int [] primeNumber = {1, 6, 7, 10, 17, 4, 41};

        for (int i=0; i < primeNumber.length; i++) {
            if (primeNumber[i]%i==0 || primeNumber[i]<=1) {
                System.out.println(primeNumber[i]+" is not a prime number");
            } else {
                System.out.println(primeNumber[i]+" is a prime number");
            }
        }
    }
}
