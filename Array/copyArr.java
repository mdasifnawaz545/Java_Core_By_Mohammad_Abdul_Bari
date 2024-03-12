import java.util.Scanner;

public class copyArr {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter elements");
        int array[]={1,2,3,4,5};
        int arr[];
        arr=new int[5];
        for (int i = 0; i < array.length; i++) {
            arr[arr.length-1-i]=array[i];
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
    
}
