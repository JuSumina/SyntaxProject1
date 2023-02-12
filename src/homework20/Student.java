package homework20;

public class Student {


    public void study() {
        System.out.println("Student studies");
    }

    public void attendClass() {
        System.out.println("Student attends class");
    }
}

    class SyntaxStudent extends Student {
        @Override
        public void study() {
            System.out.println("Syntax student studies Java");;
        }

        @Override
        public void attendClass() {
            System.out.println("Syntax student attends online classes");;
        }

        public void qaJob() {
            System.out.println("Syntax student will get QA Tester job after completing the course");
        }
    }

    class CollegeStudent extends Student {
        @Override
        public void study() {
            System.out.println("College student studies subjects related to their major");;
        }

        @Override
        public void attendClass() {
            System.out.println("College student attends online and on-campus classes");;
        }

        public void degree() {
            System.out.println("College student will graduate with a degree");
        }
    }

    class SchoolStudent extends Student {
        @Override
        public void study() {
            System.out.println("School student studies a variety of subjects");;
        }

        @Override
        public void attendClass() {
            System.out.println("School student attends on-campus classes");;
        }

        public void graduate() {
            System.out.println("School student will graduate if they pass all tests");
        }
    }



