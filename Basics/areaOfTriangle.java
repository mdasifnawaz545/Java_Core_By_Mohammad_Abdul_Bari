import java.util.*;
import java.math.*;
public class areaOfTriangle {
    public static void main(stringInJava args[])
    {
        // Method 1.

        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the height of the traingle : ");
        short height=scn.nextByte();
        System.out.println("Enter the base of the triangle : ");
        short base=scn.nextByte();
        int area1=((height*base))/2;
        System.out.println("Area of the triangle = "+area1);

        // Method 2.

        byte a;
        byte b;
        byte c;
        System.out.println("Enter the sides of the triangel : ");
        a=scn.nextByte();
        b=scn.nextByte();
        c=scn.nextByte();
        float s=(a+b+c)/2;
        double area2=(s*(s-a)*(s-b)*(s-c));
        double i;
        for(i=0.01;i*i<area2;i=i+0.01);
        System.out.println("Area of the triangle = "+i);
    }
}
