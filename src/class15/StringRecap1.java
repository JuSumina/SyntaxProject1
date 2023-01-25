package class15;

public class StringRecap1 {

    public static void main(String[] args) {

        //How can I print all the letters from this String one by one
        //The input is int, output is char

        String str="Java is Great";
        for (int i=0; i<str.length(); i++) {
            System.out.println(str.charAt(i));
        }

        int count=0;

        String str2="Java is Great";
        for (int i=0; i<str2.length(); i++) {
            if(str.charAt(i)=='a') {
                count++;
            }
        }
        System.out.println("Letter a has appeared "+count+" times.");
    }
}
