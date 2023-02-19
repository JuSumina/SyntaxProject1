package tests9;

public class Test145 {

    Test145() {
        System.out.println("Parent Constructor without argument");
    }

    Test145 (int number) {
        System.out.println(number);
    }

 }

 class Child extends Test145 {
    Child(){
        System.out.println("Child Constructor without argument");
    }

    Child (int number) {
        super(number);
    }
 }

 class ChildTest {
     public static void main(String[] args) {

         Child child1 = new Child ();
         Child child2 = new Child (10);
     }
 }
