package class35;

public interface Drawable {

    public static final String tool = "Pencil";

    void draw();

    default void print() {
        System.out.println("We are drawing object using "+tool);
    }

    static void erase () {
        System.out.println("All drawings are erasable");
    }

}

class Rectangle extends Shape implements Drawable {

    public Rectangle(String color, double width, double length) {
        super(color, width, length);
    }

    public void draw() {
        System.out.println("I am drawing a rectangle");

    }

    public double calculateArea() {
        return length*width;
    }
}

class Square implements Drawable {
    public void draw() {

    }


}

class Shape {
    String color;
    double width, length;

    Shape (String color, double width, double length) {
        this.color=color;
        this.width=width;
        this.length=length;

    }

    public double calculateArea() {
        return 0;
    }

}
