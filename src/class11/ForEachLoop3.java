package class11;

public class ForEachLoop3 {

    public static void main(String[] args) {

        int [] arr={10, 13, 20, 25, 45, 50};


        for (int i=0; i < arr.length; i++) {
            if (arr[i]%2!=0) {
                arr[i]=0;
            }
        }

        System.out.println("After replacing all odd numbers with zeros");
        for (int i=0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
