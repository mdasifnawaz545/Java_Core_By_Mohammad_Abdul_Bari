class Outer {
    int x = 786;

    class inner {
        int y = 786;

        void innerMethod() {
            System.out.println(x);
            System.out.println(y);
            System.out.println("Inner Class");
        }

    }

    void OuterMethod() {
        System.out.println("Outer Class");
        System.out.println(x);
        inner i = new inner();
        i.innerMethod();
        System.out.println(i.y);
    }
}

public class nestedClass {
    public static void main(String args[]) {
        Outer o=new Outer();
        o.OuterMethod();
        Outer.inner i=new Outer().new inner();
        System.out.println(i.y);
        i.innerMethod();
        
    }
}
