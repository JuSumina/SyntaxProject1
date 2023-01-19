package homework8;

public class Task7b {
    public static void main(String[] args) {

        int num = 6;

        if(num<=1)
        {
            System.out.println(false);
        }
        for(int i=2;i<=Math.sqrt(num);i++) {
            if (num%i==0) {
                System.out.println(false);
            } else {
                System.out.println(true);
            }
            break;
        }

    }
}

