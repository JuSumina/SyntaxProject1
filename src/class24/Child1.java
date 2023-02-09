package class24;

public class Child1 extends Parent{

    public static void main(String[] args) {

        Child1 c1=new Child1();
        c1.hello();
        Parent.bye();
        Child1.bye();

        c1.name="Julia";
        Child1.lastName="Sumina";



    }
}
