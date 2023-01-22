package class14;

public class String11 {

    public static void main(String[] args) {

        String str1="Julia 777 $$$";

        int sum=0;

        for (int i=0; i<str1.length(); i++) {
            if (Character.isAlphabetic(str1.charAt(i))) {
                sum++;
            }
        }
        System.out.println("Total isAlphabetic in Str "+sum);

        int sum2=0;

        for (int i=0; i<str1.length(); i++) {
            if (Character.isDigit(str1.charAt(i))) {
                sum2++;
            }
        }
        System.out.println("Total isDigit in Str "+sum2);
    }
}



