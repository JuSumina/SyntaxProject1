package tests8;

public class Test122 {

    static String thirdLetter (String s) {

        StringBuilder thirdLet = new StringBuilder();
        for (int i=0; i<s.length(); i+=3) {
            thirdLet.append(s.charAt(i));
            }
        return thirdLet.toString();

    }

    public static void main(String[] args) {

        System.out.println(thirdLetter("hello there")); //"hltr"
        System.out.println(thirdLetter("technology")); //"thly"


    }
}
