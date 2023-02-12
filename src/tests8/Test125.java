package tests8;

public class Test125 {

    static int countVowels (String s) {
        return s.replaceAll("[^aeiou]","").length();
    }

    public static void main(String[] args) {

        System.out.println(countVowels("obama")); //3
        System.out.println(countVowels("happy friday! i love weekends")); //9
    }
}
