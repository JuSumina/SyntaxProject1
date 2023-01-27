package class16;

public class HwTask4b {

    public static void main(String[] args) {

        String str="This is sentence i want to reverse";
        String [] arr=str.split(" ");

        for (String words:arr) {
            System.out.print(new StringBuilder(words).reverse() + " ");
        }




    }
}
