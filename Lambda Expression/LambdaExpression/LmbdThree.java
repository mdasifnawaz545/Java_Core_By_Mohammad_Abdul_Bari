// Method Referance
@FunctionalInterface
interface Mylambda {
    public int display(String str1,String str2);
}



public class LmbdThree {
    
        // public static void reverse(String s1,String s2){
        //     StringBuffer sb=new StringBuffer(s);
        //     sb.reverse();
        //     System.out.println(sb);
        // }
    
    public static void main(String args[])
    {
        Mylambda m=String::compareTo;
        System.out.println(m.display("Hello","Hi"));
    }
}
