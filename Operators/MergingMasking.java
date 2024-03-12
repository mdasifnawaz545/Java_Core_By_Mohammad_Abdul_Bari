public class MergingMasking {
 public static void main(stringInJava args[])
 {
    byte a=8,b=1;
    byte c;
    b=(byte) (b<<4);
    c= (byte) (a^b);
    System.out.println((a));
    System.out.println((b));
    System.out.println((c));
    System.out.println((c&0b11110000)>>4);
    System.out.println((c&0b00001111));
 }  
}
