package class23;

public class ConstructorChaining {

    ConstructorChaining() {
        System.out.println("I am non argument constructor");
    }

    ConstructorChaining(String str) {
        this(); //making a call to non argument constructor
                // this() - ALWAYS must be on the first line
        System.out.println(str);

        }
    ConstructorChaining(String str, int number){
        this(str);
        System.out.println("This is constructor with integer parameter");
    }

    public static void main(String[] args) {

        ConstructorChaining obj=new ConstructorChaining("hi",10);
    }
}
