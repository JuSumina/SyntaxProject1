package tests7;

public class MyTest128 {

        int num1;
        double num2;
        char letter;

        void printInfo() {
            System.out.println(num1);
            System.out.println(num2);
            System.out.println(letter);
        }


    public static void main(String[] args) {

        MyTest128 md1=new MyTest128();
        md1.num1=10;
        md1.num2=10.23;
        md1.letter='a';
        md1.printInfo();

        MyTest128 md2=new MyTest128();
        md2.num1=100;
        md2.num2=100.23;
        md2.letter='s';
        md2.printInfo();
    }


}
