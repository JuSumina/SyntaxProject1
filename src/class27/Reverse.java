package class27;

public class Reverse {

    String reverseStr (String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static void main(String[] args) {

        Reverse reverse=new Reverse();
        System.out.println(reverse.reverseStr("Thursday"));

    }
}
