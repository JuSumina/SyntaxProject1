package homework14;

public class Task3 {

    private static String vowelsOnly (String str) {
        return str.replaceAll("[^AEIOUYaeiouy]","");
    }

    public static void main(String[] args) {

        System.out.println(vowelsOnly("Julia"));
    }
}
