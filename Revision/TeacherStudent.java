import java.lang.*;

class BlackBoard {
    String text = "Salaam,To all my Students";
    int noOfStudent=0;
    synchronized void setText(String text) {
        while(noOfStudent!=0){
            wait();
        }
        System.out.println("Techer write");
        Thread.sleep(1000);
        this.text = text;
        noOfStudent=5;
        notify();
        
    }

    synchronized void getText() {

        while(noOfStudent!=0){
            System.out.println(this.text+"from Student - "+noOfStudent);
            noOfStudent--;
            Thread.sleep(1000);
        }
        wait();
        notify();
    }

}

class Teacher implements Runnable {
    BlackBoard b1;
    int value = 1;

    Teacher(BlackBoard b) {
        b1 = b;
    }

    public void run() {
        while (true) {
            b1.setText("Salaam" + (value++));


        }

    }
}

class Student  implements Runnable{
    BlackBoard b2;
    String str;

    Student(BlackBoard b) {
        b2 = b;
    }

    public void run() {

        while (true)

        {
            b2.getText();
        }
    }
}

public class TeacherStudent {
    public static void main(String args[]) {
        BlackBoard b=new BlackBoard();
        Teacher t=new Teacher(b);
        Student s=new Student(b);
        Thread t1=new Thread(t);
        Thread t2=new Thread(s);
        t1.start();
        t2.start();
    }
}
