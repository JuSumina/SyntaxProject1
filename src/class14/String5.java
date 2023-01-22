package class14;

public class String5 {

    public static void main(String[] args) {

        String str1="Java";
        String str2="JAVA";

        boolean areEqual=str1.equals(str2);
        System.out.println(areEqual);

        boolean areEqual2=str1.equalsIgnoreCase(str2);
        System.out.println(areEqual2);
    }
}
