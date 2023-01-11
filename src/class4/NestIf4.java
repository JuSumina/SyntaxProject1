package class4;

public class NestIf4 {

    public static void main(String[] args) {

        boolean studyHard=true;
        int salary=90000;

        if(studyHard) {
            System.out.println("We get jobs");

            if (salary>100000) {
                System.out.println("Let's buy Tesla");
            }else{
                System.out.println("Let's buy Toyota");
            }




        } else {
            System.out.println("It might a little longer for us to get jobs");
        }


    }
}
