public class Prime {
    static boolean checkPrime(int n)
    {
        if(n%2==0) return true;
        else return false;
    }
    public static void main(String args[])
    {
        int n=4;
    if (checkPrime(n)) {
        System.out.println(n+" is a Prime");
    }
    else System.out.println(n+" is not a Prime");
    
    }
    
}
