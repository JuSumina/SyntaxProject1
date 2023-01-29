package homework13;

public class Student {

    char getGrade(int score) {

        if (score >= 90) {
            return 'A';
        } else if (score < 90 && score >= 80) {
            return 'B';
        } else if (score < 80 && score >= 70) {
            return 'C';
        } else if (score < 70 && score >= 50) {
            return 'D';
        } else {
            return 'F';
        }
    }
}