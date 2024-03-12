import java.util.Scanner;

public class young_old {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int a;
        a = scn.nextInt();
        if (a >= 18) {
            System.out.println("You are Young as Your age is equivalent to " + a);
        }
        else {
            System.out.println("You are Not Young as Your age is equivalent to " + a);

        }
    }
}
