package class13;

public class Loops4 {

    public static void main(String[] args) {

        for (int i=1; i<=10; i++) {
            if(i%3==0) {
                System.out.println(i);
                continue;
                
            }
            System.out.println("Hello");
            System.out.println("How are you?");
        }
    }
}
