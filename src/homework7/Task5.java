package homework7;

public class Task5 {

    public static void main(String[] args) {

        int [] number = {5, 7, 10, 12, 15};

        int sum=0;

        for (int i=0; i < number.length; i++) {

            sum=sum+(number[i]);
        }

        System.out.println(sum);
    }
}
