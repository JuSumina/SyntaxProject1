package tests9;

public class Test149 {

    void substraction (int num1, int num2, int num3, int num4) {
        System.out.println(num1-num2-num3-num4);
    }

    void substraction (int num1, int num2, int num3) {
        System.out.println(num1-num2-num3);
    }

    void substraction (int num1, int num2) {
        System.out.println(num1-num2);
    }

    public static void main(String[] args) {

        Test149 s = new Test149();
        s.substraction(50,5,3,2);
        s.substraction(40,6,3,1);
        s.substraction(30,10);
    }
}
