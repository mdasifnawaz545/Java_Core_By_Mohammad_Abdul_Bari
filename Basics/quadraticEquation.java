import java.util.Scanner;

public class quadraticEquation {
    public static void main(stringInJava args[]){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the coefficent of x^2 : ");
        float a=scn.nextFloat();
        System.out.println("Enter the coefficent of x : ");
        float b=scn.nextFloat();
        System.out.println("Enter the coefficent of constant : ");
        float c=scn.nextFloat();
        double x1,x2;
        x1=(-b+(Math.sqrt((b*b)-4*a*c)))/(2f*a);
        x2=(-b-(Math.sqrt((b*b)-4*a*c)))/(2f*a);
        System.out.println("x1 = "+x1+" x2 = "+x2);
    }
}
