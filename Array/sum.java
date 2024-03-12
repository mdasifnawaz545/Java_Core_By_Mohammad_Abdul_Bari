import java.util.Scanner;

public class sum {
    public static void main(String args[])
    {
        System.out.println("Enter the size of the array : ");
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new int[n];
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            arr[i]=scn.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];
        }
        System.out.println("Sum is "+sum);
    }
    
}
