import java.util.Scanner;

public class rotateArray {
    public static void main(String args[])
    {
        Scanner scn=new Scanner(System.in);
        int arr[]=new int[10];
        System.out.println("Enter the Element : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=scn.nextInt();
        }
        System.out.println("Element : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf(+arr[i]+" ");   
        }
        System.out.println("left Rotated Elements are : ");
        int temp=arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=temp;
        for (int i = 0; i < arr.length; i++) {
            System.out.printf(+arr[i]+" ");   
        }

    }
}
