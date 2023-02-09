package homework18;

public class EmployeeTest {

    public static void main(String[] args) {

        Employee employee = new Employee("Jane", 123, "Manager");
        employee.printInfo();


        PartTime ptEmployee = new PartTime("John", 456, "Developer", 30);
        ptEmployee.printInfo();
        ptEmployee.partTimeEmployeeInfo();


        FullTime ftEmployee = new FullTime("Jessica", 789, "UI Designer", "medical insurance, 2 week vacation, 401K");
        ftEmployee.printInfo();
        ftEmployee.fullTimeEmployeeInfo();
    }
}
