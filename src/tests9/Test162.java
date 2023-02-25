package tests9;

public class Test162 {

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

        Test162 employee = new Test162();
        employee.setName("Mario");
        System.out.println("Employee Name: "+employee.getName());
        employee.setAge(32);
        System.out.println("Employee Age: "+employee.getAge());

    }
}
