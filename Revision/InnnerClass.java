package Revision;

interface i {
    void display();
}

class parent {
    void meth() {
        i io = new i() {
            public void display() {
                System.out.println("Salaam");
            }
        };
        io.display();
    }

}

class singleton {
    static int i = 10;
    static singleton sngle = null;

    static singleton getInstace() {
        if (sngle == null)
            sngle = new singleton();
            else sngle=null;
        return sngle;

    }
}

public class InnnerClass {
    public static void main(String args[]) {
        singleton s=singleton.getInstace();
        System.out.println(s.i);
        singleton s1=singleton.getInstace();
        System.out.println(s==null);
        System.out.println(s1==null);
    }
}
