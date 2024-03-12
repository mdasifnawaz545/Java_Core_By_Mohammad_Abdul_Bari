public class regularExp3 {
    public static void main(String args[]) {
        // Find a number is binary or not.
        int number = 101100110;
        String num = number+"";
        boolean bn;
        bn = num.matches("[01]*");
        System.out.println(bn);

        // Find a number is Hexa-decimal or not.

        
        String hexa="176EA";
        bn=hexa.matches("[0-9 A-F]+");
        System.out.println(bn);


        // Find a date is in Date format or not.
        
        String date="15/01/2024";
        boolean bn2=date.matches("[0-3][0-9]/[0-1][1-12]/[0-9]{4}");
        System.out.println(bn2);
    }

}
