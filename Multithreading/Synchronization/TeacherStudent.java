package Multithreading.Synchronization;

class WhiteBoard {
    String str;
    int noOfStudent = 0;

    synchronized void set(String str) {
        while (noOfStudent != 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        this.str = str;
        System.out.println("Teacher : " + str);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        noOfStudent = 5;
        notify();
    }

    synchronized String get() {
        if (noOfStudent == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }

        notify();
        return " Written by Student " + noOfStudent--;

    }
}

class Teacher extends Thread {
    WhiteBoard W1;

    Teacher(WhiteBoard wh) {
        W1 = wh;
    }

    public void run() {

        while (true) {
            W1.set("KhusAamdid Dear Students...");
        }
    }
}

class Student extends Thread {
    WhiteBoard W2;

    Student(WhiteBoard wh) {
        W2 = wh;
    }

    public void run() {
        while (true) {
            System.out.println(W2.get());

        }

    }
}

public class TeacherStudent {
    public static void main(String args[]) {
        WhiteBoard w = new WhiteBoard();
        Teacher t = new Teacher(w);
        Student s = new Student(w);
        t.start();
        s.start();

    }
}
