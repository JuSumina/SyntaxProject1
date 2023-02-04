package class23;

public class Teacher {

    String name;
    int teachedId;

    String subject;

    Teacher (String name, int teacherId){

        this.name=name;
        this.teachedId=teacherId;
    }

    Teacher (String name, int teachedId, String subject) {
        this(name, teachedId);
        this.subject=subject;

    }

}
