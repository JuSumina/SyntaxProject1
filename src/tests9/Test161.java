package tests9;

public class Test161 {

    private String empName;

    private int empAge;

    public String getName() {
        return empName;
    }

    public void setName(String newName) {
        this.empName = newName;
    }

    public int getAge() {
        return empAge;
    }

    public void setAge(int newAge) {
        this.empAge = newAge;
    }

    public static void main(String[] args) {

        Test161 employee = new Test161();
        employee.setName("John");
        System.out.println("Employee Name: "+employee.getName());
        employee.setAge(30);
        System.out.println("Employee Age: "+employee.getAge());

    }
}
