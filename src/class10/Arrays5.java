package class10;

public class Arrays5 {

    public static void main(String[] args) {


        int [] number = new int [5];

        number[0]=45;
        number[1]=44;
        number[2]=33;
        number[3]=20;
        number[4]=10;

        int sum=0;

        for (int i=0; i < number.length; i++) {
            if (i % 2 == 0) {
                sum=sum+number[i];
            }
        }

        System.out.println(sum);

    }
}
