import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class StudentProblem {
    public static void main(String args[]) {
        try (FileOutputStream fos1 = new FileOutputStream("Source.txt")) {
            String str = "salaam,the most important thing in your life you must have to know about it early before others know about that.";
            fos1.write(str.getBytes());

        } catch (IOException e) {
            System.out.println(e);
        }
        try (FileOutputStream fos2 = new FileOutputStream("Source2.txt");) {
            try (FileInputStream fis1 = new FileInputStream("Source.txt")) {
                byte[] b = new byte[fis1.available()];
                fis1.read(b);
                String st = "";
                for (byte s : b) {
                    st = st + (char) s;
                }
                st = st.toUpperCase();
                fos2.write(st.getBytes());
            }

        } catch (IOException e) {
            System.out.println(e);
        }

    }
}
