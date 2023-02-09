package homework18;

public class Shape {

    double radius;

    Shape (double radius) {

        this.radius=radius;

    }
}

class Circle extends Shape{


    Circle (double radius) {
        super(radius);

    }

        void areaCalculator () {
            System.out.println("The area of the circle with radius "+radius+" is "+(3.14159*radius*radius));

        }
}

