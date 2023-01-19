package homework8;

public class Task11 {

    public static void main(String[] args) {

        /*
        Write a program to print out duplicate elements from an Array of Strings?
         */

        String [] fruit = {"apple", "orange", "banana", "apple", "strawberry", "apple"};

        for (int i=0; i< fruit.length; i++) {
            if (fruit[i].equals("apple")) {
                System.out.println(fruit[i]);
            }


        }
    }
}
