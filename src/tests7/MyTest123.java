package tests7;

public class MyTest123 {

    boolean bothEven (int num1, int num2) {

        if (num1%2==0 && num2%2==0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        MyTest123 result=new MyTest123();

        System.out.println(result.bothEven(3,4));
    }
}
