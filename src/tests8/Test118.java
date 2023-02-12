package tests8;

public class Test118 {

    static int number;

    public static void main(String[] args) {

        Test118 staticNum = new Test118();
        staticNum.number=200;

        System.out.println(Test118.number);
        System.out.println(staticNum.number);

    }
}
