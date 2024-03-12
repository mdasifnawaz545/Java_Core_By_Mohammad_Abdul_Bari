public class emailVerify {
    public static void main(String args[])
    {
        String str="java123@gmail.in";
        boolean bn;
        bn=str.matches(".*@gmail.*");
        String user,domain;
        int index=str.indexOf('@');
        user=str.substring(0,index);
        domain=str.substring(index+1);
        System.out.println(user);
        System.out.println(domain);
        bn=domain.startsWith("gmail");
        System.out.println(bn);
    }
    
}
