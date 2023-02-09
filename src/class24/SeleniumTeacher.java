package class24;

import homework16.Teacher;

public class SeleniumTeacher extends Teacher {

    public static void main(String[] args) {

        SeleniumTeacher selenium= new SeleniumTeacher();
        selenium.teach();
        selenium.giveHomework(); //protected available through inheritance


    }
}
