interface Mylambda {
    public void display(String str);
}

public class LmbdOne {
public static void main(String args[])
{
    Mylambda l=(str)->{System.out.println(str);};

    l.display("Salaam");
    
}

}

