package OOPS.MethodOverriding;
class Rectangle{
    int length;
    int breadth;
    int area(){
        return length*breadth;
    }
}
class Cuboid extends Rectangle{
    int height;
    int area(){
        return length*breadth*height;
    }
}
public class mthover {
    public static void main(String args[])
    {
        Cuboid c=new Cuboid();
        Rectangle r=new Rectangle();
        r.length=6;
        r.breadth=6;
        c.length=5;
        c.breadth=5;
        c.height=5;
        System.out.println("Area = "+c.area());
        System.out.println("Area = "+r.area());
    }
}
