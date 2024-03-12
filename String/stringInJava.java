

public class stringInJava{

    public static void main(String[] args) {
        char chr[] = {'M', 'O', 'H', 'A', 'M', 'M', 'A', 'D'};
        String str1 = new String(chr);
        String str2 = new String("MOHAMMAD ASIF NAWAZ");
        char c[] = {'H', 'e', 'l', 'l', 'o'};
        String str3 = new String(c);
        String str4 = new String(c, 1, 3);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        String s="MOHAMMAD ASIF NAWAZ";
        String str11=new String("MOHAMMAD ASIF NAWAZ");
        
        System.out.println(s);
        System.out.println(str2==s);//False
        System.out.println(str2==str11);//True Why ?

    }

}
