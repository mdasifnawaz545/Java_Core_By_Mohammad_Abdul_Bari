package OOPS.Intrefaces;

interface Test{
    void meth1();
    void meth2();
}
class Tes implements Test{
    public void meth1(){
        System.out.println("Method 1 has overrided.");
    }
    public void meth2(){
        System.out.println("Method 2 has overrided.");
    }
    public void meth3(){
        System.out.println("Method 3 has overrided.");
    }
}

class Interface{
    public static void main(String args[])
    {
        Test t=new Tes();
        t.meth1();
        t.meth2();
        // t.meth3();
    }
}