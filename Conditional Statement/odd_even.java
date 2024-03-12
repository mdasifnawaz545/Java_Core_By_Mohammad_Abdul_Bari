import java.util.Scanner;

public class odd_even{
    public static void main(String args[])
    {
        Scanner scn=new Scanner(System.in);
        int a;
        a=scn.nextInt();
        if(a%2==0){
            System.out.println(a+" is a Prime Number");
        }
        else {
            System.out.println(a+" is Not a Prime Number");

        }
    }
}