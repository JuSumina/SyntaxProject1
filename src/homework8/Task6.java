package homework8;

public class Task6 {

    public static void main(String[] args) {

        /*
        Write a program to swap 2 numbers without a temporary variable?
         */

        int [] arr={10, 16, 7, 42, 3, 28};


        for (int i=0; i < arr.length; i++) {
            if (arr[i]%2!=0) {
                arr[i]=777;
            }
        }

        System.out.println("Our array after replacing all odd numbers with 777");
        for (int i=0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
