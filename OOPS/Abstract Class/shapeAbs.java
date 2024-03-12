abstract class Shape {
    abstract float perimeter();

    // abstract Shape{()}; How to create a Constructor inside an Abstract Class.

    abstract float area();
}

class Circle extends Shape {
    float radius;

    Circle(float radius) {
        this.radius = radius;
    }

    float perimeter() {
        return 2 * 3.14f * this.radius;
    }

    float area() {
        return 3.14f * this.radius * this.radius;
    }
}

class Rectangle extends Shape {
    int length, breadth;

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    float perimeter() {
        return 2 * (this.length + this.breadth);
    }

    float area() {
        return this.length * this.breadth;
    }
}

public class shapeAbs {
    public static void main(String args[]) {

        Shape s1 = new Circle(5);
        Shape s2 = new Rectangle(5, 5);

        System.out.println("Perimeter of the Circle = " + s1.perimeter());
        System.out.println("Area of the Circle = " + s1.area());
        System.out.println("Perimeter of the Rectangle = " + s2.perimeter());
        System.out.println("Area of the Rectangle = " + s2.area());

    }

}
