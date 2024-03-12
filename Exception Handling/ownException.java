class LowBalanceException extends Exception{
    public String toString(){
        return "Balance is not Sufficient";
    }
}

public class ownException {

    static void meth1(){
        try{
            
            throw new LowBalanceException();
        }
        catch(LowBalanceException e){
            e.printStackTrace();
        }
    }

    static void meth2(){
        meth1();
    }
    static void meth3(){
        meth2();
    }
    static void meth4(){
        meth3();
    }

    public static void main(String args[])
    {
        meth4();
    }
    
}
