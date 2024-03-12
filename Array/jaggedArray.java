// Jagged array is a type of 2D array which consists of array of array of different size.

import java.util.Scanner;

public class jaggedArray {
    public static void main(String args[])
    {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the elements");
        int Jarr[][]=new int[3][];
        Jarr[0]=new int [3];
        Jarr[1]=new int [5];
        Jarr[2]=new int [2];
        for (int i = 0; i < Jarr.length; i++) {
            for (int j = 0; j < Jarr[i].length; j++) {
                System.out.println("Enter the element : "+(i+1)+" "+(j+1));
                Jarr[i][j]=scn.nextInt();
            }
            
        }
        System.out.println("Elements of the Jagged Array is  :");
        for (int i = 0; i < Jarr.length; i++) {
            for (int j = 0; j < Jarr[i].length; j++) {
                System.out.print(Jarr[i][j]);
       
            }
            System.out.println();
        }
    }
    
}
