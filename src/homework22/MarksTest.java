package homework22;

public class MarksTest {

    public static void main(String[] args) {

        StudentA studentA=new StudentA(88, 84, 98);
        System.out.println(studentA.getPercentage());

        StudentB studentB=new StudentB(83, 78, 85, 93);
        System.out.println(studentB.getPercentage());

    }
}
