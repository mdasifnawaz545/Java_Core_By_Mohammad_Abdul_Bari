package Multithreading;

class InnerthreadClass extends Thread {
    public void run() {
        int i = 0;
        while (i < 5) {
            System.out.println("Salaam...");
            i++;
        }
    }

}

class threadClass {

    public static void main(String args[]) {
        InnerthreadClass I = new InnerthreadClass();
        I.start();
        int i = 0;
        while (i < 5) {
            System.out.println("Kheriyat ?");
            i++;
        }
    }

}