package Multithreading;

class MyThread extends Thread {
    public void run() {
        int count = 0;
        int i = 1;
        while (i<10) {
            System.out.println(count++);
            // try {
            // // Thread.sleep(100);
            // } catch (InterruptedException e) {
            // System.out.println(e);
            // }
            i++;
        }
    }
}

public class threadInstanceMethod {
    public static void main(String args[]) {
        MyThread M = new MyThread();
        M.setDaemon(true);
        M.start();
        // M.interrupt();
        // try {
        // Thread.sleep(10);
        // } catch (InterruptedException e) {
        // System.out.println(e);
        // }
        // Thread MainThread = Thread.currentThread();
        // try {
        // MainThread.join();
        // } catch (InterruptedException e) {
        // System.out.println(e);
        // }
        // Thread.yield();
        Thread.dumpStack();
        int i=1;
        while(i<10){
            System.out.println("Main Thread");
            i++;
        }
    }
}
