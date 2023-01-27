package class17;

public class Arrays2 {

    public static void main(String[] args) {

        int [] arr=new int[3];
        arr [0]=10;
        arr [1]=20;
        arr [2]=30;

        String [] colors={"black", "white", "red", "purple", "blue"};

        for (String color: colors) {
            System.out.print(color+" ");
        }

        for (int num:arr) {
            System.out.println(num);
        }



    }
}
