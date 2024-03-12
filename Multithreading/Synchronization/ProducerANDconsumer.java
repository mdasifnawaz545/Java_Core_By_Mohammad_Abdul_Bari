package Multithreading.Synchronization;

class Mydatas {
    int value = 0;
    boolean turn = true;

    synchronized int get() {
        while (turn != false) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        turn = true;
        notify();
        return value;
    }

    synchronized void set(int v) {
        while (turn != true) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        value = v;
        turn = false;
        notify();
    }

}

class Producer extends Thread {
    Mydatas D1;

    Producer(Mydatas obj) {
        D1 = obj;
    }

    public void run() {
        int i = 1;
        while (true) {
            D1.set(i);
            System.out.println("Producer : " + i);
            try{
                Thread.sleep(2000);
            }catch(InterruptedException e){
                System.out.println(e);
            }
            i++;
        }
    }
}

class Consumer extends Thread {
    Mydatas D2;

    Consumer(Mydatas obj) {
        D2 = obj;
    }

    public void run() {

        while (true) {
            System.out.println("Consumer : " + D2.get());

        }
    }
}

public class ProducerANDconsumer {
    public static void main(String args[]) {
        Mydatas m = new Mydatas();
        Producer p = new Producer(m);
        Consumer c = new Consumer(m);
        p.start();
        try{
            Thread.sleep(100);
        }catch(InterruptedException e){
            System.out.println(e);
        }
        c.start();
    }
}
