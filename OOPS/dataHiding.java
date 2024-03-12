class Rectangle {
    private float length;
    private float breadth;

    void setLength(float l) {
        length = l;
    }

    float getLength() {
        return length;
    }

    void setBreadth(float b) {
        breadth = b;
    }

    float getBreadth() {
        return breadth;
    }
    float area(){
        return length*breadth;
    }
    float perimeter(){
        return 2*(length+breadth);
    }
}

public class dataHiding {

    public static void main(String args[]) {
        Rectangle r = new Rectangle();
        r.setLength(5f);
        System.out.println(r.getLength());
        r.setBreadth(5f);
        System.out.println(r.getBreadth());
        System.out.println("Area of the Rectangle = "+r.area());
        System.out.println("Perimeter of the Rectangle = "+r.perimeter());
    }

}
