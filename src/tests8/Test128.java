package tests8;

public class Test128 {

    private String name;
    String city;
    protected String schoolName;
    public int batchNumber;

    void printInfo () {

        System.out.println("My name is "+name+" and I live in "+city+". I study at "+schoolName+" in batch "+batchNumber);
    }

    public static void main(String[] args) {

        Test128 md = new Test128();
        md.name="John";
        md.city="Miami";
        md.schoolName="Syntax";
        md.batchNumber=9;
        md.printInfo();


    }
}
