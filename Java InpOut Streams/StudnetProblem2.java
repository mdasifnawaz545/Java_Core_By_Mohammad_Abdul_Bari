import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

public class StudnetProblem2 {
    public static void main(String args[]) throws Exception {
        FileOutputStream fos = new FileOutputStream("Destination.txt");
        FileInputStream fis1 = new FileInputStream("Source.txt");
        FileInputStream fis2 = new FileInputStream("Source2.txt");
        SequenceInputStream sqi = new SequenceInputStream(fis1, fis2);
        // int b;
        byte by[]=new byte[sqi.available()];
        sqi.read(by);
        // while ((b = sqi.read()) != -1) {
            fos.write(by);
        // }
    }
}
