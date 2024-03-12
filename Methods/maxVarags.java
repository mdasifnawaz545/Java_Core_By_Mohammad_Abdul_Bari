public class maxVarags {
    int maximum(int ...x)
    {
        int max=0;
        for (int i : x) {
            if(i>max) max=i;
        }
        return max;
    }
    public static void main(String args[])
    {
        maxVarags mx=new maxVarags();
        int max=mx.maximum(10,20,43,756,72,786);
        System.out.println("Maximum is "+max);
    }
    
}
