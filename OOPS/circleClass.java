public class circleClass {

    static public class circle{
        float radius;
        static float area(float r){
            return 3.14f*r*r;
        }
        static float circumference(float r)
        {
            return 2*3.14f*r;
        }
        static float perimeter(float r)
        {
            return 2*r;
        }
    }
    public static void main(String args[])
    {
        circle cr= new circle();
        cr.radius=5;
        float area,perimeter,circumference;
        perimeter=cr.perimeter(cr.radius);
        circumference=cr.circumference(cr.radius);
        area=cr.area(cr.radius);
        System.out.println("Perimeter of the Circle = "+perimeter);
        System.out.println("Cirumference of the Circle = "+circumference);
        System.out.println("Area of the Circle = "+area);
    }

}
