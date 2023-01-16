package homework7;

public class Task2b {

    public static void main(String[] args) {

        String [] name = new String [8];

        name[0]="Maziar";
        name[1]="Pat";
        name[2]="Rosalia";
        name[3]="Shafquat";
        name[4]="Shahriar";
        name[5]="Viktor";
        name[6]="Yuliya";
        name[7]="Zhadyra";

        for (int i = 0; i < name.length; i++) {
            if (name[i].equals("Yuliya")) {
                System.out.println("My name is "+name[i]);

            }

        }
    }
}