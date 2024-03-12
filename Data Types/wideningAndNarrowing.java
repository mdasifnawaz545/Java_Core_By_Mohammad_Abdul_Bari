public class wideningAndNarrowing{
    public static void main(stringInJava args[])
    {
        byte b=10;
        short s=10;
        int i=10;
        long l=1909438058093419l;
        float f= 93.93f;
        double d=848438403.4338;
        char c='a';
        boolean bn;
        b=(byte)s;//Narrowing
        f=l;
        f=b;
        f=s;
        f=i;
        System.out.println(f);
    }
}