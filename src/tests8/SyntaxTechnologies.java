package tests8;

public class SyntaxTechnologies {

    String schoolName;
    int batch;
    int year;
    String lastDayOfClass;


    SyntaxTechnologies () {
        this.schoolName=schoolName;
        this.batch=batch;
        this.year=year;
        this.lastDayOfClass=lastDayOfClass;

    }

    SyntaxTechnologies (String schoolName, int batch, int year, String lastDayOfClass) {
        this.schoolName=schoolName;
        this.batch=batch;
        this.year=year;
        this.lastDayOfClass=lastDayOfClass;

    }

    public static void main(String[] args) {

        SyntaxTechnologies syntTech1 = new SyntaxTechnologies();
        System.out.println(syntTech1.schoolName+" "+syntTech1.batch+" "+syntTech1.year+" "+syntTech1.lastDayOfClass);


        SyntaxTechnologies syntTech2 = new SyntaxTechnologies("Syntax", 6, 2020, "07/30/2020");
        System.out.println(syntTech2.schoolName+" "+syntTech2.batch+" "+syntTech2.year+" "+syntTech2.lastDayOfClass);

    }

}
