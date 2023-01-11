package homework2;

public class Task1 {

    public static void main(String[] args) {
        boolean diploma = false;
        double gpa = 3.4;

        if (diploma) {
            System.out.println("Congratulations!");

        } else {
            System.out.println("Get a degree!");

            if (gpa>=3.5) {
            System.out.println("You are eligible for scholarship");

            } else {
                System.out.println("You should have studied harder");
            }
        }
    }
}
