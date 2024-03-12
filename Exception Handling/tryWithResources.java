import java.io.FileReader;

class tryResources{
    public String method1() throws Exception{
        FileReader f=new FileReader("My.txt");
        try{
            String str="My Name is MOHAMMAD ASIF NAWAZ";
            int n=f.read();
            System.out.println(n);
        }
        finally{
            f.close();
        }  
        return "Alhamdulillah";
    }
}


public class tryWithResources {
    public static void main(String args[])
    {
        tryResources r=new tryResources();
        try{
            System.out.println(r.method1());
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
