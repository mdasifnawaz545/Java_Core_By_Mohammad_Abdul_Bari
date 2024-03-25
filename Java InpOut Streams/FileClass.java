import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileClass {
    public static void main(String args[]) {
        File f = new File("C:\\Users\\KIIT");
        System.out.println(f.getParent());
        String file[] = f.list();
        // for (String string : file) {
        // System.out.println(string);
        // }
        File list[] = f.listFiles();
        for (File file2 : list) {
            System.out.println(file2.getName());
            // if (file2.isFile()) {
            //     try (FileInputStream fis = new FileInputStream(file2.getAbsolutePath())) {
            //         int x;
            //         while ((x = fis.read()) != -1) {
            //             System.out.print((char) x);
            //         }
            //     } catch (IOException e) {
            //         System.out.println(e);
            //     }
            }
            System.out.println();
            System.out.println("File Number 2");
            System.out.println();

        }

    }

