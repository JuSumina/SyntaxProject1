package homework15;

public class Student {

    String name;
    String address;

    Student (String studentName, String studentAddress){

        name=studentName;
        address=studentAddress;

    }

    void displayInfo(){

        System.out.println(name+"'s address is "+address);
    }
}
