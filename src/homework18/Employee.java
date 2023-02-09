package homework18;

public class Employee {

    String name;

    int id;

    String jobTitle;

    Employee (String name, int id, String jobTitle) {
        this.name=name;
        this.id=id;
        this.jobTitle=jobTitle;
    }

    void printInfo () {
        System.out.println(name+" is a "+jobTitle+". Their ID is "+id);
    }
}

class PartTime extends Employee{

    int workHours;

    PartTime (String name, int id, String jobTitle, int workHours) {
        super(name, id, jobTitle);
        this.workHours=workHours;
    }

    void partTimeEmployeeInfo () {
        System.out.println(name+" works "+workHours+" hours per week.");
    }

}

class FullTime extends Employee{

    String benefits;

    FullTime (String name, int id, String jobTitle, String benefits) {
        super(name, id, jobTitle);
        this.benefits=benefits;
    }

    void fullTimeEmployeeInfo () {
        System.out.println(name+" receives following benefits: "+benefits);
    }
}