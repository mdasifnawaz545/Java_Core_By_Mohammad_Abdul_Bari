class thrExp extends Exception {
    public String toString() {
        return "Numbers are of negative type";
    }
}

class Methods {
    static public int Area(int length, int breadth) throws thrExp {
        if (length < 0 || breadth < 0)
            throw new thrExp();
        return length * breadth;
    }

    static void func1() throws thrExp {
        int r = Area(10, -5);
        System.out.println("Area is = " + r);
    }

    static void func2() throws thrExp {
        func1();
    }
}

public class throwANDthrowsOwn {
    public static void main(String args[]) {
        Methods m = new Methods();
        try {
            m.func2();
        } catch (thrExp e) {
            System.out.println(e);
        }
    }
}
