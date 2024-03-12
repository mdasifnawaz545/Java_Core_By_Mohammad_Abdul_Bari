class MyObject{
public String toString(){
    return "Overrided method of the Object parent class";
}
}


public class first {
    public static void main(String args[])
    {
        MyObject m=new MyObject();
        System.out.println("Value is "+m.getClass());
    }
    
}
