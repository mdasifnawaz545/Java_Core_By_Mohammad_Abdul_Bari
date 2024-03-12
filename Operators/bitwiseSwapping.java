public class bitwiseSwapping {
    public static void main(stringInJava args[]) {
        // Store to decimal number in 1 Byte;
        int a = 9, b = 12;
        System.out.println("Before swapping : a= " + a + " b= " + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("After swapping : a= " + a + " b= " + b);
        int ch = 'A';
        System.out.println((char) ch);
        ch = ch ^ 32;
        System.out.println((char) ch);
    }
}