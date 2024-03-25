import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

class Producer extends Thread {
    OutputStream os;

    public Producer(OutputStream o) {
        os = o;
    }

    public void run() {
        int count = 0;
        try {
            while (true) {
                os.write(count);
                os.flush();
                System.out.println("Producer - " + count);
                Thread.sleep(10);
                System.out.flush();
                count++;
            }

        } catch (IOException e) {
            System.out.println("Some Error has been Caught");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }

}

class Consumer extends Thread {
    InputStream io;
    int x;

    public Consumer(InputStream i) {
        io = i;
    }

    public void run() {
        try {
            while (true) {
                x = io.read();
                System.out.println("Consumer - " + x);
                Thread.sleep(10);
                System.out.flush();
            }

        } catch (IOException e) {
            System.out.println(e);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class PipedStream {
    public static void main(String args[]) {
        PipedInputStream pis = new PipedInputStream();
        PipedOutputStream pos = new PipedOutputStream();
        try {
            pos.connect(pis);
        } catch (IOException e) {
            System.out.println(e);
        }
        Producer p = new Producer(pos);
        Consumer c = new Consumer(pis);
        p.start();
        c.start();
    }
}
