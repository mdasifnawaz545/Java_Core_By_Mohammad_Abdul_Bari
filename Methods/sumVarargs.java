public class sumVarargs {
    static void sum(int ...x){
        int sum=0;
        for (int i : x) {
            sum=sum+i;
        }
        System.out.println("Total Price is "+sum);
        float dis=sum-(sum*15)/100;
        System.out.println("Total Price after Discount is "+dis);
    }
    public static void main(String ...args)
    {
        for (String string : args) {
            
        }
    }
    
}
