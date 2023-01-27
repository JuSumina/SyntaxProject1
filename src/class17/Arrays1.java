package class17;

public class Arrays1 {

    public static void main(String[] args) {

        int [] arr=new int[3];
        arr [0]=10;
        arr [1]=20;
        arr [2]=30;

        System.out.println(arr[2]);
        System.out.println("Size of the array is"+arr.length);

        for (int i=0; i<arr.length;i++ ) {
            System.out.println(arr[i]);
        }

    }
}
