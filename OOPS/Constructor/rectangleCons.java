package Constructor;

public class rectangleCons {
    static class InnerrectangleCons {
        int length;
        int breadth;

        public InnerrectangleCons() {
            length = 5;
            breadth = 5;
        }

        public InnerrectangleCons(int l, int b) {
            length = l;
            breadth = b;
        }
    }

    public static void main(String args[]) {
        InnerrectangleCons rec = new InnerrectangleCons(10, 20);
        System.out.println(rec.length);
        System.out.println(rec.breadth);
    }
}
