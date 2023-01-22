package class14;

public class String10 {

    public static void main(String[] args) {

        String str1="Java is love";

        char c=str1.charAt(2);
        System.out.println(c);

        int sum=0;

        for (int i =0; i<str1.length(); i++) {
            System.out.print(str1.charAt(i));
            if (str1.charAt(i) == 'a') {
                sum++;

            }

        }
        System.out.println();
        System.out.println(sum);



    }
}
