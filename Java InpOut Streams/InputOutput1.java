import java.io.FileOutputStream;
import java.io.IOException;

public class InputOutput1 {
    public static void main(String args[]) {
        try (FileOutputStream fos = new FileOutputStream("Text.txt")) {
            String str = "MOHAMMAD ASIF NAWAZ IS A GOOD BOY";
            byte b[] = str.getBytes();
            // for (byte x : b) {
                fos.write(b);
            // }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
