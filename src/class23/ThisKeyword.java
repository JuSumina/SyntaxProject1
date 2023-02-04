package class23;

public class ThisKeyword {

    int a,b;

    ThisKeyword (int a, int b) {
        this.a=a;
        this.b=b;

    }

    public void sum (int a, int b) {
        System.out.println("Sum of local variable = "+(a+b));
        System.out.println("Sum of local variable = "+(this.a+this.b));
    }

    void hello () {
        System.out.println("Hello batch 15");
    }

    void howAreYou () {
        System.out.println("How are you batch 15?");
    }

    void greetings() {
        hello ();
        howAreYou();
    }

    public static void main(String[] args) {

        ThisKeyword obj = new ThisKeyword(10,20);

        obj.sum(100, 200);

        obj.greetings();

    }
}
