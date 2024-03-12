import java.util.Scanner;
// Again solve only by using string method.
public class type_of_website {
    public static void main(String args[])
    {
        Scanner scn=new Scanner(System.in);
        System.out.printf("Enter the URL : ");
        String url=scn.nextLine();
        if (url.endsWith(".com")) {
            System.err.println("Commercial Website");
        }
        else         if (url.endsWith(".com")) {
            System.err.println("Commercial Website");
        }
        else         if (url.endsWith(".org")) {
            System.err.println("organisational Website");
        }
        else         if (url.endsWith(".gov")) {
            System.err.println("Government Website");
        }
        else         if (url.endsWith(".in")) {
            System.err.println("International Website");
        }

        }
}
