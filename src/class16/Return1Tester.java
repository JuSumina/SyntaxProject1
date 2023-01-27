package class16;

public class Return1Tester {

    public static void main(String[] args) {

        Return1 r1=new Return1();
        String str=r1.method1();
        System.out.println(str);

        int result=r1.method2();
        System.out.println(result);
    }
}
