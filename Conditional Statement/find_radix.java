import java.util.Scanner;

public class find_radix {
    public static void main(String args[])
    {
        Scanner scn=new Scanner(System.in);
        String str=scn.nextLine();
        if(str.matches("[0-1]+"))
        {
            System.out.println("Binary Number : "+str);
        }
        else if(str.matches("[0-7]+"))
        {
            System.out.println("Octal Number : "+str);

        }
        else if(str.matches("[0-9 A-F]+"))
        {
            System.out.println("HexaDecimal Number : "+str);

        }
        else 
        {
            System.out.println("Decimal Number : "+str);
        }
    }
}
