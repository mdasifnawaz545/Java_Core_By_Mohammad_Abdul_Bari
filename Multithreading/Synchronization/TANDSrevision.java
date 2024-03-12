class BlackBoard {
    String text;
    int count=0;
    synchronized void write(String text) {
        while(count!=0){
            try{
                wait();
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
        this.text = text;
        System.out.println(text);
        count=5;
        notify();
    }

    synchronized void read() {
        while(count!=0){
            System.out.println("Student " + "" + " Written");
            count--;
        }
        notify();
        

    }
}

class Ustad implements Runnable {
    BlackBoard b;

    Ustad(BlackBoard bb) {
        b = bb;
    }

    public void run() {
        while (true) {
            b.write("Sabak Number 1 - Datane-e-Gulstan");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class Sagird implements Runnable {
    BlackBoard b;

    Sagird(BlackBoard b) {
        this.b = b;
    }

    public void run() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        while (true) {
            b.read();
        }
    }
}

public class TANDSrevision {
    public static void main(String args[]) {
        BlackBoard b = new BlackBoard();
        Ustad u = new Ustad(b);
        Sagird s = new Sagird(b);
        Thread t1 = new Thread(u);
        Thread t2 = new Thread(s);
        t1.start();
        t2.start();
    }
}
