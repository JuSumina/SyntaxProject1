package class18;

public class Method2Tester {

    public static void main(String[] args) {

        Method2 md= new Method2();

        boolean isEven=md.isEven(100);
        System.out.println(isEven);


        boolean isEven1=md.isEven(12);
        System.out.println(isEven1);

        Method2 md2= new Method2();

        boolean isEven2=md.isEven(20);
        System.out.println(isEven2);


    }
}
