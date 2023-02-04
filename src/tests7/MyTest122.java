package tests7;

public class MyTest122 {

    String str (String myStr) {
        return myStr.toUpperCase();
    }

    public static void main(String[] args) {

        MyTest122 strUpperCase= new MyTest122();
        System.out.println(strUpperCase.str("Test"));
    }
}
