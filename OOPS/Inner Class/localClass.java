class Outer{
    int i=786;
    void method(){
        class Inner{
            int y=786;
            void display(){
                System.out.println(i);
                System.out.println(y);
            }

        }
        Inner i=new Inner();
        i.display();
    }
    
}

public class localClass {
    public static void main(String args[])
    {
        Outer o=new Outer();
        o.method();
    }
    
}
