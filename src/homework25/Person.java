package homework25;

public class Person {

    private String name;
    private String lastName;
    private int age;
    private double salary;

    public Person(String name, String lastName, int age, double salary) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    void printInfo () {
        System.out.println("Person's name is "+name+" "+lastName+". "+name+" is "+age+". "+name+" makes "+salary+" per year.");
    }
}
