package Multithreading.Synchronization;

// Sharable Object

class Mydata {
   synchronized void display(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
}

class thread1 extends Thread {
    Mydata d1;

    thread1(Mydata obj) {
        d1 = obj;
    }

    public void run() {
        d1.display("Java");
    }
}

class thread2 extends Thread {
    Mydata d2;

    thread2(Mydata obj) {
        d2 = obj;
    }

    public void run() {
        d2.display("Language");
    }
}

public class sync {
    public static void main(String args[]) {
        Mydata m = new Mydata();
        thread1 t1 = new thread1(m);
        thread2 t2 = new thread2(m);
        t1.start();
        t2.start();
    }
}
