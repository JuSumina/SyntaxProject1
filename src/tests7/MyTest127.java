package tests7;

public class MyTest127 {

    int year;
    String schoolName;
    int batchNum;

    void printInfo (){
        System.out.println("I am a student of batch "+batchNum+" studying at "+schoolName+" in the year of "+year);
    }

    public static void main(String[] args) {

        MyTest127 myInfo=new MyTest127();
        myInfo.year=2023;
        myInfo.schoolName="Syntax";
        myInfo.batchNum=15;

        myInfo.printInfo();
    }
}
