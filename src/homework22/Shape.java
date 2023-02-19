package homework22;

public interface Shape {

    void calculateArea ();

    void calculatePerimiter();

}

class Circle implements Shape {

    double radius;

    Circle (double radius) {
        this.radius=radius;
    }

    @Override
    public void calculateArea() {
        System.out.println(3.14*radius*radius);
    }

    @Override
    public void calculatePerimiter() {

        System.out.println(2*3.14*radius);

    }
}

class Square implements Shape {

    int side;

    Square (int side) {
        this.side=side;
    }

    @Override
    public void calculateArea() {
        System.out.println(side*side);
    }

    @Override
    public void calculatePerimiter() {

        System.out.println(4*side);

    }
}
