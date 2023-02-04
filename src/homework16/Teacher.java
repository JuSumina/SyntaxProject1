package homework16;

public class Teacher {

    String teacherName;
    int teacherId;

    void teach() {
        System.out.println("Every class out teacher teaches us something new");
    }

    void giveHomework() {
        System.out.println("Our teacher gives us homework");
    }

    void checkHomework() {
        System.out.println("Our teacher always checks whether we did our homework or not");
    }

    void gradeQuiz() {
        System.out.println("Our teacher grades our quizzes");
    }

}

class MathTeacher extends Teacher {

    boolean hasRuler;

    void mathOperations (){
        System.out.println("Math teacher teaches their students how to add, deduct, multiply and divide numbers");
    }
}

class ChemistryTeacher extends Teacher {

    boolean hasLab;

    void react () {
        System.out.println("Chemistry teacher mixes different substances together to show how they react when combined");
    }
}

class PianoTeacher extends Teacher {

    boolean hasPiano;

    void playPiano() {
        System.out.println("Piano teacher shows their students how to play piano");
    }
}