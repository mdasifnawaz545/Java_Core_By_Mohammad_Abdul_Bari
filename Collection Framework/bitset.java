import java.util.BitSet;

public class bitset {
    public static void main(String args[]) {
        BitSet bs1 = new BitSet();
        BitSet bs2 = new BitSet();
        bs1.set(1);
        bs1.set(3);
        bs1.set(5);
        bs1.set(7);
        bs1.set(9);

        bs2.set(2);
        bs2.set(4);
        bs2.set(6);
        bs2.set(8);
        bs2.set(10);
        System.out.println(bs1);
        bs1.and(bs2);
        System.out.println(bs1);

    }

}
