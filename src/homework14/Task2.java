package homework14;

public class Task2 {

    public static String reverseStr(String str){

        return new StringBuilder(str).reverse().toString();
    }

    public static void main(String[] args) {

        Task2 task2=new Task2();
        task2.reverseStr("Sunday");
    }

}
