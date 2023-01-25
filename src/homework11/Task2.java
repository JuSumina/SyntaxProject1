package homework11;

public class Task2 {

    public static void main(String[] args) {

        String str = "Sunday";

        char[] chararr = str.toCharArray();

        for (int i = chararr.length - 1; i >= 0; i--)

            System.out.print(chararr[i]);

        System.out.println();

        for (int i=str.length()-1; i>=0; i--) {
            System.out.print(str.charAt(i));
        }

    }

}


