package tests9;

public class Person {

    String name;
    String lastName;
    int age;

    Person (String name, String lastName, int age) {
        this.name=name;
        this.lastName=lastName;
        this.age=age;
    }

    public static void main(String[] args) {

        Employee employee = new Employee("Joe", "Smith", 35);
        employee.salary=35000;
        employee.printInfo();

        Student student = new Student ("Adam", "Smith", 15);
        student.grade=10;
        student.printInfo();

        Retiree retiree = new Retiree ("Frank", "Smith", 15);
        retiree.seniorActivity="tour";
        retiree.printInfo();
    }

}

class Employee extends Person{

    int salary;

    Employee (String name, String lastName, int age) {
        super(name, lastName, age);
    }

    void printInfo () {
        System.out.println(name+" "+lastName+" "+age+" "+salary);
    }

}

class Student extends Employee{

    int grade;

    Student (String name, String lastName, int age) {
        super(name, lastName, age);
    }

    void printInfo () {
        System.out.println(name+" "+lastName+" "+age+" "+grade);
    }

}

class Retiree extends Student{

    String seniorActivity;

    Retiree (String name, String lastName, int age) {
        super(name, lastName, age);
    }

    void printInfo () {
        System.out.println(name+" "+lastName+" "+age+" "+seniorActivity);
    }

}

