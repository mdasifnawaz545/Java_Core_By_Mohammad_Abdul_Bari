package Multithreading;

public class threadSameClass extends Thread{

        public void run(){
            int i = 0;
            while (i < 5) {
                System.out.println("Salaam...");
                i++;
            }
        }

    public static void main(String[] args) {
        threadSameClass t=new threadSameClass();
        t.start();
        int i = 0;
        while (i < 5) {
            System.out.println("Kheriyat ?");
            i++;
        }
    }
}
