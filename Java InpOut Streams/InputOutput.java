import java.io.FileOutputStream;
import java.io.IOException;

public class InputOutput {
    public static void main(String args[]){
        try(FileOutputStream fos=new FileOutputStream("C:/Users/Text.txt")){
            String str="MOHAMMAD ASIF NAWAZ";
            fos.write(str.getBytes());
        }catch (IOException e){
            System.out.println(e);
        }
    }
}
