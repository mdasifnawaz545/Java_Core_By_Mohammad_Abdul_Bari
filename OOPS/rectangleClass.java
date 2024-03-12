class rectangle {
    float length;
    float breadth;

    float area() {
        return length * breadth;
    }

    float perimeter() {
        return 2 * (length + breadth);
    }

    boolean isSquare() {
        if (perimeter() == 4*breadth) {
            return true;
        } else
            return false;
    }

}

public class rectangleClass {
    public static void main(String args[]) {

        rectangle r1 = new rectangle();
        r1.length = 5;
        r1.breadth = 5;
        rectangle r2 = new rectangle();
        r2.length = 10;
        r2.breadth = 10;
        System.out.println("Area of Rectangle 1 : " + r1.area());
        System.out.println("Area of Rectangle 2 : " + r2.area());
        System.out.println("Perimeter of Rectangle 1 : " + r1.perimeter());
        System.out.println("Perimeter of Rectangle 2 : " + r2.perimeter());
        System.out.println("IsSquare Rectangle 1 : " + r1.isSquare());
        System.out.println("IsSquare Rectangle 2 : " + r2.isSquare());
    }
}
