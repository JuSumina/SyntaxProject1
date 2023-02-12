package tests8;

public class Test139 {

    String name;
    String lastName;
    int employeeId;
    String startDate;
    int salary;

    Test139 () {

    }

    Test139 (String name, String lastName, int employeeId, String startDate, int salary) {
        this.name=name;
        this.lastName=lastName;
        this.employeeId=employeeId;
        this.startDate=startDate;
        this.salary=salary;
    }

    void printInfo() {
        System.out.println(name+" "+lastName+" "+employeeId+" "+startDate+" "+salary);
    }

    public static void main(String[] args) {

        Test139 employee1 = new Test139();
        employee1.printInfo();

        Test139 employee2 = new Test139("Joe", "Smith", 12345, "01/01/1970", 35000);
        employee2.printInfo();
    }
}
