package tests10;

public class Test165 {

    String firstName;
    String lastName;
    int birthMonth;
    int birthDay;
    int birthYear;
    String ssn;

    Test165 (String firstName, String lastName, int birthMonth, int birthDay, int birthYear, String ssn) {
        this.firstName=firstName;
        this.lastName=lastName;
        this.birthMonth=birthMonth;
        this.birthDay=birthDay;
        this.birthYear=birthYear;
        this.ssn=ssn;

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public String getSsn() {
        return ssn;
    }

    public String formatBirthday () {
        return getBirthMonth()+"/"+getBirthDay()+"/"+getBirthYear();
    }

    public static void main(String[] args) {

        Test165 person = new Test165("John", "Doe", 10, 25, 1900, "123-45-6789");

        System.out.println(person.getFirstName());
        System.out.println(person.getLastName());
        System.out.println(person.formatBirthday());
        System.out.println(person.getSsn());

    }
}
