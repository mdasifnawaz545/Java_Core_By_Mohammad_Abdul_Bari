class Stats {
    static int i = 786;
    static String name;

    static void display() {
        System.out.println(i);
    }

    void non_display() {
        System.out.println(i);
    }

    static {
        name = "MOHAMMAD ASIF NAWAZ";
        System.out.println(name);
    }

}

public class static_Part {
    public static void main(String args[]) {
        // Stats s = new Stats();
        // System.out.println(s.i);
        System.out.println(Stats.i);
        // s.display();
        Stats.display();
        // s.non_display();
        // Stats.non_display();

    }

}
