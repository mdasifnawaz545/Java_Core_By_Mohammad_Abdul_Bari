import java.util.Scanner;

public class menuDriven {
    public static void main(String args[]) {
        System.out.println("Menu Driven Program");
        System.out.printf("Enter two number : ");
        Scanner scn = new Scanner(System.in);
        float exp;
        int i=1;
        float a, b;
        a = scn.nextFloat();
        b = scn.nextFloat();
        while (true) {
        System.out.println("1.Addition");
        System.out.println("2.Substraction");
        System.out.println("3.Multipliaction");
        System.out.println("4.Division");
        int choice = scn.nextInt();
        
            switch (choice) {
                case 1:
                    exp = a + b;
                    System.out.println(+exp);
                    break;
                case 2:
                    exp = a - b;
                    System.out.println(+exp);
                    break;
                case 3:
                    exp = a * b;
                    System.out.println(+exp);
                    break;
                case 4:
                    exp = a / b;
                    System.out.println(+exp);
                    break;
    
            
            }
        }
        
    }
}
