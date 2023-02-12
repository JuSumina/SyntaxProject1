package tests8;

public class Test119 {

    static String mixString (String s1, String s2) {

        StringBuilder mixedString = new StringBuilder();
        for (int i = 0; i < s1.length(); i++) {
            mixedString.append(s1.charAt(i));
            mixedString.append(s2.charAt(i));
        }

        return mixedString.toString();
    }


    public static void main(String[] args){
        String firstValue = mixString("12345","abcde");
        System.out.println(firstValue);
        String secondValue = mixString("howdy","hello");
        System.out.println(secondValue);

    }
}
