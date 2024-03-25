import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;

public class BufferStream {
    public static void main(String args[]) throws Exception {
        FileReader fis = new FileReader("Destination.txt");
        BufferedReader bis = new BufferedReader(fis);
        String str = "";
        int x;
        // while((x=bis.read())!=-1)
        // {
        // str=str+(char)x;
        // }
        // System.out.println(str);
        // Now we are going to use mark and reset mehtod of the i/o operation.

        bis.mark(10);
        System.out.println(bis.read());
        System.out.println(bis.read());
        System.out.println(bis.read());
        System.out.println(bis.read());
        System.out.println(bis.read());
        System.out.println(bis.read());
        bis.reset();
        System.out.println(bis.read());
        System.out.println(bis.read());
        System.out.println(bis.read());
        System.out.println(bis.read());
        System.out.println(bis.read());
        System.out.println(bis.read());


    }
}
