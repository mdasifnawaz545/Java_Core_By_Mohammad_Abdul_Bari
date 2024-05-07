import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Stringtokeniser {
    public static void main(String args[]) throws Exception {
        FileInputStream fr = new FileInputStream("MyData.txt");
        byte b[]=new byte[fr.available()];
        fr.read(b);
        String s=new String(b);

        StringTokenizer st=new StringTokenizer(s,"= ");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
            
        }
    }

}
