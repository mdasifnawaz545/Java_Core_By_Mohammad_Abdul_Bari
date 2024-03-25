import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ByteStream {
    public static  void main(String [] args) throws Exception{
        byte b[]={'a','b','c','d','e','f'};
        // ByteArrayOutputStream bos=new ByteArrayOutputStream();
        // bos.write(b);
        // bos.writeTo(new FileOutputStream("MyFFile.txt"));
        FileOutputStream fos=new FileOutputStream("MyFFile.txt");
        fos.write(b);
        // int x;
        // String str="";
        // while((x=bis.read())!=-1){
        //     str+=(char)x;
        //     System.out.print((char)x);
        // }
        // System.out.println(str);
    }
}
