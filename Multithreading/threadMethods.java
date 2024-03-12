package Multithreading;

class thre extends Thread {

    public void run() {

        int i = 0;
        while (i < 10) {
            System.out.println("2. Salaam...I am MOHAMMAD ASIF NAWAZ" +
                    "");
            i++;
        }
    }

    public thre(String name) {
        super(name);
        setPriority(MAX_PRIORITY);
    }
}

public class threadMethods {

    public static void main(String args[]) {
        thre t = new thre("MyThread");
        t.start();
        int i = 0;
        while (i<10) {
            System.out.println("1. Salaam...I am MOHAMMAD ASIF NAWAZ" +
                    "");
            i++;
            try{
                Thread.sleep(100);
            }catch(InterruptedException e)
            {
                System.out.println(e);
            }
        }
        
        System.out.println("Thread ID :" + t.getId());
        System.out.println("Thread Name :" + t.getName());
        System.out.println("Thread priority :" + t.getPriority());
        System.out.println("Thread Alive :" + t.isAlive());
        System.out.println("Thread Daemon :" + t.isDaemon());
        System.out.println("Thread State :" + t.getState());
        System.out.println("Thread priority :" + t.getPriority());
        // try sleep and intreppt method of therad as well.
        t.interrupt();

    }
}
