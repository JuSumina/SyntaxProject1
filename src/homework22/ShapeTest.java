package homework22;

public class ShapeTest {

    public static void main(String[] args) {

        Circle circle = new Circle(15);
        circle.calculateArea();
        circle.calculatePerimiter();

        Square square = new Square (10);
        square.calculateArea();
        square.calculatePerimiter();

    }
}
