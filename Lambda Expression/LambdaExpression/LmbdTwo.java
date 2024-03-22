interface Mylambda {
    public void display(String str);
}

class MyDemo {
    public static void getmeth(Mylambda l) {
        l.display("salaam");
    }
}

public class LmbdTwo {
    public static void main(String args[]) {
        MyDemo.getmeth((s) -> {
            System.out.println(s);
        });
    }
}
