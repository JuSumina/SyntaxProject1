package class14;

public class String7 {

    public static void main(String[] args) {

        String str1="I love Java";
        boolean startWith=str1.startsWith("I");
        System.out.println(startWith);

        boolean endsWith=str1.endsWith("a");
        System.out.println(endsWith);

        System.out.println(str1.toLowerCase().startsWith("i"));

        System.out.println(str1.contains("java"));

    }
}
