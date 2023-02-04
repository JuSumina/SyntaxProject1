package tests7;

public class MyTest121 {


    int addition (int num1, int num2) {
        int add= num1+num2;
        return add;
    }

    int multiplication (int num1, int num2) {
        int multiply=num1*num2;
        return multiply;
    }

    int substraction (int num1, int num2) {
        int substract=num1-num2;
        return substract;
    }

    public static void main(String[] args) {

        MyTest121 md=new MyTest121();

        System.out.println("Addition "+md.addition(20,10));
        System.out.println("Multiplication "+md.multiplication(3,10));
        System.out.println("Subtraction "+md.substraction(30,10));

    }
}
