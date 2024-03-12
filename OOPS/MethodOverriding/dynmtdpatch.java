package OOPS.MethodOverriding;

class Area{
    void area1(){
        System.out.println("Area 1");
    }
    void area2(){
        System.out.println("Area 2");
    }
}
class Myarea extends Area{
    void area1(){
        System.out.println("Area 1");
    }
    void area2(){
        System.out.println("Area 2");
    }
    void area3(){
        System.out.println("Area 3");
    }
}


public class dynmtdpatch {
    public static void main(String args[])
    {
        Area a=new Myarea();
        a.area1();
        a.area2();
    }
}
