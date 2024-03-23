import java.io.FileInputStream;
import java.io.IOException;

public class InputOutput2 {
    public static void main(String args[]) {
        try (FileInputStream fis = new FileInputStream("Text.txt")) {
            byte b[]=new byte[fis.available()];
            fis.read(b,fis.available()-8,fis.available()-((fis.available()-8)));
            String str="";
            for (byte c : b) {
                str+=(char)c;
            }
            System.out.println(str);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
