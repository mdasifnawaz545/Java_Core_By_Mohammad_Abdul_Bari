public class MultipleTryCatch {
    public static void main(String args[]) {
        try {

            int arr[] = { 786, 1, 2, 3, 4, 5 ,0};
            try {
                int div = arr[9];
                System.out.println(div);
                // System.out.println(arr[10]);
                // System.out.println(arr[1] + arr[10]);
            } catch (ArithmeticException e) {
                System.out.println("Arithmetic Operation Error");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Index is out of the Range");
            }
        } catch (AbstractMethodError e) {
            System.out.println("Some Errr has been occured");
        }

    }
}
