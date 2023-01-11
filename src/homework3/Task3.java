package homework3;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter Quiz score");
        int quizSc=scanner.nextInt();
        System.out.println("Please enter Mid Term score");
        int midSc=scanner.nextInt();
        System.out.println("Please enter Final score");
        int finalSc=scanner.nextInt();

        int average=(quizSc+midSc+finalSc)/3;
        System.out.println("Your average is "+average);

        if (average>=90 ) {
            System.out.println("You receive A");
        } else if (average>=70 && average<90) {
            System.out.println("You receive B");
        } else if (average>=50 && average<70) {
            System.out.println("You receive C");
        } else {
            System.out.println("You receive F");
        }

    }
}
