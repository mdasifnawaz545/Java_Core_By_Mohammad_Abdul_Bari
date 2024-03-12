interface Inter {
    void display();
}

class Outer {
    int i = 786;

    void method() {
        Inter y = new Inter() {
            public void display() {
                System.out.println(i);
                System.out.println("Ananyomous Class");
            }
        };
        y.display();
    }
}

public class ananyomousClass {
    public static void main(String args[]) {
        Outer o = new Outer();
        o.method();
    }
}
