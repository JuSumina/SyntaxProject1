package homework16;

public class TeacherTester {

    public static void main(String[] args) {

        Teacher teacher1=new Teacher();
        teacher1.teacherName="John";
        teacher1.teacherId=1234;
        teacher1.teach();
        teacher1.giveHomework();
        teacher1.checkHomework();
        teacher1.gradeQuiz();

        MathTeacher mathT1=new MathTeacher();
        mathT1.teacherName="Jennifer";
        mathT1.teacherId=2345;
        mathT1.hasRuler=true;
        mathT1.teach();
        mathT1.giveHomework();
        mathT1.checkHomework();
        mathT1.gradeQuiz();
        mathT1.mathOperations();

        ChemistryTeacher chemistryT1=new ChemistryTeacher();
        chemistryT1.teacherName="Walter";
        chemistryT1.teacherId=3456;
        chemistryT1.hasLab=true;
        chemistryT1.teach();
        chemistryT1.giveHomework();
        chemistryT1.checkHomework();
        chemistryT1.gradeQuiz();
        chemistryT1.react();

        PianoTeacher pianoT1=new PianoTeacher();
        pianoT1.teacherName="Wendy";
        pianoT1.teacherId=4567;
        pianoT1.hasPiano=true;
        pianoT1.teach();
        pianoT1.giveHomework();
        pianoT1.checkHomework();
        pianoT1.gradeQuiz();
        pianoT1.playPiano();



    }
}
