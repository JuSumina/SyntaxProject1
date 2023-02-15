package class30;

public class MovAbleTest {

    public static void main(String[] args) {

        MovAble [] movables = {new Car(), new Dog()};
        for (MovAble m:movables) {
            m.move();
        }

        OwnAble [] ownables = {new Car(), new Dog()};
        for (OwnAble o:ownables) {
            o.own();
        }
    }
}
