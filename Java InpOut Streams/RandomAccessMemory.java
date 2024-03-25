import java.io.*;

public class RandomAccessMemory {

    public static void main(String args[]) throws Exception {

        RandomAccessFile rm = new RandomAccessFile("Destination.txt", "rw");
        System.out.println((char) rm.read());
        System.out.println((char) rm.read());
        System.out.println((char) rm.read());
        rm.write('A');
        System.out.println(rm.getFilePointer());
        rm.seek(0);
        System.out.println((char) rm.read());
        System.out.println((char) rm.read());
        System.out.println((char) rm.read());
        System.out.println((char) rm.read());
        System.out.println((char) rm.read());
        System.out.println((char) rm.read());
        rm.seek(rm.getFilePointer()+4);
        System.out.println((char) rm.read());
        System.out.println((char) rm.read());
        System.out.println((char) rm.read());
        System.out.println((char) rm.read());
        System.out.println((char) rm.read());
        System.out.println((char) rm.read());

        
        

    }
}
