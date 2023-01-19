package homework8;

public class Task5 {

    public static void main(String[] args) {

        /*
        Create a 2D array of integers. Develop a program which will calculate the sum of even
        and odd numbers for that array.
         */

        int[][] arr = {{7, 13, 10},
                {6, 22, 9},
        };


        int sumEven=0;
        int sumOdd=0;


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] % 2 == 0) {
                    sumEven = sumEven + arr[i][j];
                } else {
                    sumOdd = sumOdd + arr[i][j];
                }
            }
        }
        System.out.println("Sum of all even numbers is "+sumEven);
        System.out.println("Sum of all odd numbers is "+sumOdd);
    }
}
