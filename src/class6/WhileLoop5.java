package class6;

public class WhileLoop5 {

    public static void main(String[] args) {

        boolean condition=true;
        int num=0;

        while (condition) {
            System.out.println("Hello World");
            if(num>3) {
                condition=false; }
            num++;
        }
    }
}
