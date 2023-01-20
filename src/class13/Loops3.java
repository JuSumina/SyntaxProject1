package class13;

public class Loops3 {

    public static void main(String[] args) {

        for (int i=2; i<=20; i+=5) {
            System.out.println(i);

            if(i==12) {
                System.out.println("i is equal to 12 - I am breaking the loop");
                break;

            }
        }
    }
}
