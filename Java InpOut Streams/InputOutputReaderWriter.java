import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class InputOutputReaderWriter {

    public static void main(String args[]) {

        // try (FileWriter fw = new FileWriter("MyText.txt")) {
        // String str = "MOHAMMAD ASIF NAWAZ";
        // fw.write(str);
        // } catch (IOException e) {
        // System.out.println(e);
        // }

        try (FileReader fd = new FileReader("MyText.txt")) {
            String str = "";
            int x;
            while ((x = fd.read()) != -1) {
                str += (char) x;

            }
            System.out.println(str);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
