package class6;

public class WhileLoop4 {

    public static void main(String[] args) {

        int num=1;
        boolean flag = true;

        while (flag) {

            System.out.println(num);

            if (num>3) {
                flag=false;
            }
            num++;
        }

    }
}
