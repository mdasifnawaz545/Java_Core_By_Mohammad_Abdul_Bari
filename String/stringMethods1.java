public class stringMethods1 {
    public static void main(String args[])
    {
        String str="stringObject";
        System.out.println(str);
        // boolean bm=str.endsWith("Ob");
        int in=str.indexOf("t");
        System.out.println(in);
        in=str.lastIndexOf("t",10);
        System.out.println(in);
        // in=str.lastIndexOf("s");
        // System.out.println(in);
    }
}
