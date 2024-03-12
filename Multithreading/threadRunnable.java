package Multithreading;

class threading implements Runnable{
    public void run(){
        int i = 0;
        while (i < 5) {
            System.out.println("Kheriyat ?");
            i++;
        }
    }
}

public class threadRunnable {

    public static void main(String args[])
    {
        threading t=new threading();
        Thread T=new Thread(t);
        T.start();
        int i = 0;
        while (i < 5) {
            System.out.println("Salaam...");
            i++;
        }
    }
}
