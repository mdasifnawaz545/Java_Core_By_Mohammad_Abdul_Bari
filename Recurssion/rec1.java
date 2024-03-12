package Recurssion;

public class rec1 {
    void display(int n) {
        if (n > 0) {
            display(n - 1);
            System.out.println(n);
        }
    }

    public static void main(String args[]) {
        rec1 r = new rec1();
        r.display(5);
    }

}
