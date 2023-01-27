package tests6;

public class MyTest85 {

    public static void main(String[] args) {

        String s1="hello how are you";

        char lastLetter1=s1.charAt(s1.length()-1);
        String lastLetter2=String.valueOf(lastLetter1);
        boolean lastLetter3=lastLetter2.equals("u");
        System.out.println(lastLetter3);


        boolean lastWord1=s1.endsWith("world");
        System.out.println(lastWord1);

        boolean lastWord2=s1.endsWith("are");
        System.out.println(lastWord2);

        boolean lastWord3=s1.endsWith("you");
        System.out.println(lastWord3);


    }
}
