class Point{
    protected int x,y;
    public Point(int _x,int _y){
        x=_x;
        y=_y;
    }
}
public class Main {
    public static void main(String args[])
    {
        Point p=new Point(); // It is not defined inside that class that's why, There is by default a constructor which automatically gets overrided by any of the parametrized or non-parametarized constructor.
        System.out.println("x = "+p.x+" , y= "+p.y);

    }
}
