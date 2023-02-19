package tests9;

public class Test156 {

    public static String reverseStr(String str){

        return new StringBuilder(str).reverse().toString();
    }

    public static void main(String[] args) {

        Test156 task2=new Test156();
        System.out.println(task2.reverseStr("hello"));
    }
}
