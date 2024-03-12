import java.net.Socket;

final class Fnl {
    final int I = 786;
    final String NAME = "MOHAMMAD ASIF NAWAZ";
    static final float FLO;

    final void method() {
        System.out.println(I);
    }

    static {
        FLO = 786f;
        System.out.println("Salaam");
    }
    final int F;

    Fnl() {
        F = 786;
    }
}

// class N extends Fnl {
//     void meth() {
//         System.out.println("Salaam");
//         System.out.println("MOHAMMAD ASIF NAWAZ");
//     }
 
// }

public class Final_Part {
    public static void main(String args[]) {
        System.out.println(Fnl.FLO);
        Fnl f = new Fnl();
        System.out.println(f.I);
        f.method();
        System.out.println(f.NAME);
        System.out.println();
    }

}
