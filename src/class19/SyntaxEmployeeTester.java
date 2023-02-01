package class19;

public class SyntaxEmployeeTester {

    public static void main(String[] args) {

        SyntaxEmployee employee1=new SyntaxEmployee();

        employee1.empID=1234;
        employee1.salary=100000;
        System.out.println(employee1.empID);
        System.out.println(employee1.salary);
        System.out.println(SyntaxEmployee.CEO);

        SyntaxEmployee employee2=new SyntaxEmployee();

        employee2.empID=5678;
        employee2.salary=200000;
        System.out.println(employee2.empID);
        System.out.println(employee2.salary);
        System.out.println(SyntaxEmployee.CEO);




    }
}
