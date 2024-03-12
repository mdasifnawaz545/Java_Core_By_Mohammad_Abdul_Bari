
public class leap_year {
    public static void main(String args[]) {
        int lp = 2003;
        if (lp % 4 == 0) {
            if (lp % 100 == 0) {
                if (lp % 400 == 0) {
                    System.out.println("Leap year");

                }
                System.out.println("Not a Leap year");
            } else {
                System.out.println("Leap year");

            }
        } else {
            System.out.println("Not a Leap year");

        }
    }

}
