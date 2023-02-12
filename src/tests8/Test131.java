package tests8;

public class Test131 {

    public String alphabetical (String str) {
        StringBuilder alphabetOrder = new StringBuilder();

        //int strLen=str.length()+1;
        for (int i = 1; i < str.length(); i++) {
            char c = str.charAt(i);
            char cPrevious = str.charAt(i-1);
            if (c>cPrevious) {
                alphabetOrder.append(c);
            }
        }
        return alphabetOrder.toString();
    }

    public static void main(String[] args) {

        Test131 a = new Test131();
        System.out.println(a.alphabetical("software"));
    }
}
