public class tryANDcatch {
    public static void main(String args[]) {
        try {
            int a = 10, b = 5, c;
            System.out.println(a);
            System.out.println(b);

            try {
                c = a / b;
                System.out.println(c);

            } catch (ArithmeticException e) {
                System.out.println("Arithmetic Error can't read undefined values");
            }
            System.out.println("Program Ends");

        } catch (ArithmeticException e) {
            System.out.println("Some error has been occured");
        }
        finally{
            System.out.println("Finally Block");
        }
    }
}
