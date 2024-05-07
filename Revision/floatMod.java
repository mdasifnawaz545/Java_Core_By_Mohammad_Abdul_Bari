package Revision;

import java.lang.ref.Reference;

class RegluarExp {
    private String Binary;
    private String Hexa;
    private String Date;
    

    public static void test(){
        int  b=10;
        System.out.println(b);
    }
    public static void test2(){
        int  b=20;
        System.out.println(b);
    }
    
    
    // void setBinary(String exp) {
    //     int a=10;
    //     System.out.println(a);
    //     Binary = "[01]+";
    //     Hexa = "[A-F 0-9]+";
    //     Date = "[0-3][0-9]/[01][1-9]/[0-9]{4}";
    // }

    // String getBinary() {
    //     return Binary;
    // }

}

public class floatMod {
    public static void main(String args[]) {

        RegluarExp re=new RegluarExp();
        re.test();
        re.test2();
        // byte a=9;
        // byte b=8;
        // byte c=0;
        // c=((byte)(c|b));
        // c=(byte)(c<<4);
        // c=(byte)(c|a);
        // // 8
        // System.out.println((c&0b11110000)>>4);
        // System.out.println((c&0b00001111));
        // RegluarExp re=new RegluarExp();
        // String s="1010";
        // System.out.println(s.matches(re.getBinary()));

        // String email = "mdasifnawaz545@@gmail.com";
        // System.out.println(email.matches("[a-z 0-9]+@[a-z]+.[a-z]+"));

        // String jaggedArray[][] = new String[5][];
        // jaggedArray[0] = new String[1];
        // jaggedArray[1] = new String[2];
        // jaggedArray[2] = new String[3];
        // jaggedArray[3] = new String[4];
        // jaggedArray[4] = new String[5];
        // for (int i = 0; i < jaggedArray.length; i++) {
        //     for (int j = 0; j < jaggedArray[i].length; j++) {
        //         jaggedArray[i][j] = "10";

        //     }

        // }
        // for (int i = 0; i < jaggedArray.length; i++) {
        //     for (int j = 0; j < jaggedArray[i].length; j++) {

        //         System.out.print(jaggedArray[i][j]);

        //     }
        //     System.out.println();

        // }
        // for (String str[] : jaggedArray) {
        //     for (String s : str) {
        //         System.out.print(s);
                
        //     }
        //     System.out.println();
            
        // }

    }
}
