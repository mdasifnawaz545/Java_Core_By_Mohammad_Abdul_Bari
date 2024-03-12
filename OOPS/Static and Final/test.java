abstract class abs{
    static int i=786;
    abstract void display();
    static void meht1(){
        System.out.println("Salaam");
    }
    abs(){
        System.out.println("Constructor");
    }
}

class absss extends abs{
    void meth1(){
        System.out.println("Redifining static method");
    }
    void display(){
        System.out.println("Salaam");
    }
}


public class test {
    public static void main(String args[])
    {
        absss a=new absss();
        a.meth1();
        a.display();
    }
}
