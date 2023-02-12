package tests8;

public class Test124 {

    static int countA(String s) {

        int countA = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.toLowerCase().charAt(i) == 'a') {
                countA++;

            }
        }
        return countA;
    }

    public static void main(String[] args) {

        System.out.println(countA("aaA")); //3
        System.out.println(countA("aaBBdf8k3AAadnklA")); //6
    }
}
