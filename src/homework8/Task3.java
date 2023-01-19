package homework8;

public class Task3 {

    public static void main(String[] args) {

        /*
        Create a 2D array of integer values. Print the sum of all numbers.
         */

        int[][] arr = {{7, 13, 10},
                {6, 22, 4},
        };


        int sum = 0;


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
            sum = sum + arr[i][j];
            }
        }
        System.out.println(sum);

    }
}
