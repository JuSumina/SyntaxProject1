package class10;

public class Arrays6 {

    public static void main(String[] args) {


        int [] number = {10, 20, 30, 4, 5, 6, 7, 80};

        int sum=0;

        for (int i=0; i < number.length; i++) {
            if (number[i]%2 == 0)

            sum=sum+(number[i]);
        }

        System.out.println(sum);

    }
}
