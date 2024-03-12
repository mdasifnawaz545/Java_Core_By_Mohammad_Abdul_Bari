public class stingsMethods2 {
    public static void main(String args[])
    {
        String str1="Java";
        String str2="JAVA";
        boolean b;
        b=str1.equalsIgnoreCase(str2);
        System.out.println(b);
        System.out.println((str1==str2));
        int cmp=str1.compareTo(str2);
        System.out.println(cmp);
        int st=12345;
        String n=str2.valueOf(st);
        System.out.println(n);
    }
    
}
