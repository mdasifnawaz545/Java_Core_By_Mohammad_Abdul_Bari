import java.util.Scanner;

public class areaOfcuboid {
    public static void main (String args[]) {
        // Find the total area and the total volume of the cuboid.

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the side a : ");
        float l = scn.nextFloat();
        System.out.println("Enter the side b : ");
        float b = scn.nextFloat();
        System.out.println("Enter the side c : ");
        float h = scn.nextFloat();
        double area = 2 * ((l * b) + (b * h) + (l * h));
        double volume = l * b * h;
        System.out.println("Area of the Cuboid = " + area);
        System.out.println("Volume of the Cuboid = " + volume);
    }
}
