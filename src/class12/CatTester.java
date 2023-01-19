package class12;

public class CatTester {

    public static void main(String[] args) {

        //creating an object from a Cat class

        Cat cat1=new Cat();

        cat1.name="Jackson";
        cat1.breed="Persian";
        cat1.age=2;
        cat1.color="Striped";
        cat1.attitude=false;
        cat1.eat();

        Cat cat2=new Cat();
        cat2.name="Loki";
        cat2.breed="Van cat";
        cat2.age=3;
        cat2.color="White";
        cat2.attitude=true;
        cat2.speak();


    }
}
