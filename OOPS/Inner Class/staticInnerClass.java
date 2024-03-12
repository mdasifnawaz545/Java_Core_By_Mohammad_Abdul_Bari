class Outer {
    int i = 786;

    static class Inner {
        int y = 786;

        void innerMethod() {
            System.out.println(y);
            System.out.println("Inner Method");
        }

    }

    void outerMethod() {
        System.out.println("Outer Method");
    }

}

public class staticInnerClass {
    public static void main(String args[]) {
        Outer.Inner i = new Outer.Inner();
        i.innerMethod();
    }

}
