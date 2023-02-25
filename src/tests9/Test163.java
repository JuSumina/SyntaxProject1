package tests9;

public class Test163 {

    private String empName="John";

    private int empAge=30;

    public String getName() {
        return empName;
    }

    public int getAge() {
        return empAge;
    }

    public static void main(String[] args) {

        Test163 employee = new Test163();
        System.out.println("Employee Name: "+employee.getName());
        System.out.println("Employee Age: "+employee.getAge());
    }

}
