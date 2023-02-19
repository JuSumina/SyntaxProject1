package homework22;

public abstract class Marks {

    abstract double getPercentage ();
}

class StudentA extends Marks {

    double mathMark;
    double historyMark;
    double biologyMark;

    StudentA (double mathMark, double historyMark, double biologyMark) {
        this.mathMark=mathMark;
        this.historyMark=historyMark;
        this.biologyMark=biologyMark;
    }

    @Override
    double getPercentage() {
        return (mathMark+historyMark+biologyMark)/3;
    }
}

class StudentB extends Marks {

    double mathMark;
    double historyMark;
    double biologyMark;

    double chemistryMark;

    StudentB (double mathMark, double historyMark, double biologyMark, double chemistryMark) {
        this.mathMark=mathMark;
        this.historyMark=historyMark;
        this.biologyMark=biologyMark;
        this.chemistryMark=chemistryMark;
    }

    @Override
    double getPercentage() {
        return (mathMark+historyMark+biologyMark+chemistryMark)/4;
    }
}