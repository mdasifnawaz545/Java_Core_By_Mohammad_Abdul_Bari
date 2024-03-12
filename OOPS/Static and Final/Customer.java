class Account{
    private String ac_no;
    private static int count=1;
    Account(){
        ac_no="92341"+(Math.floor(Math.random()*100000)+10)+"-"+(count);
        System.out.println(ac_no);
        count++;
    }
}



public class Customer {
    public static void main(String args[])
    {
        Account a1=new Account();
        Account a2=new Account();
        Account a3=new Account();
        Account a4=new Account();
        Account a5=new Account();
        
    }
}
