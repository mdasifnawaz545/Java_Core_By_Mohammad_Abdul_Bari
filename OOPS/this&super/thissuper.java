
class Rectangle {
    int length;
    int breadth;

    int area() {
        return length * breadth;
    }

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
}

class Cuboid extends Rectangle {
    int height;

    Cuboid(int l, int b, int height) {
        super(l, b);
        this.height = height;
    }

    int volume() {
        return length * breadth * height;
    }
}

public class thissuper {
    public static void main(String args[]) {
        Cuboid c = new Cuboid(5, 5, 5);
        System.out.println(c.area());
        System.out.println(c.volume());
    }
}
