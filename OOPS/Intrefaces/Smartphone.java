package OOPS.Intrefaces;

class Phone {
    void call() {
        System.out.println("Calling Function");
    }

    void sms() {
        System.out.println("SMS Function");
    }
}

interface Icamera {
    void picture();

    void video();
}

interface InasheedPlayer {
    void play();

    void pause();

    void next();
}

class smartphone extends Phone implements Icamera, InasheedPlayer {
    public void picture() {
        System.out.println("Picture Function");
    };

    public void video() {
        System.out.println("Video Function");
    };

    public void play() {
        System.out.println("Play Function");
    };

    public void pause() {
        System.out.println("Pause Function");
    };

    public void next() {
        System.out.println("Next Function");
    };

}

public class Smartphone {
    public static void main(String args[]) {
        smartphone s = new smartphone();
        Icamera i = s;
        InasheedPlayer n = s;
        i.picture();
        
    }
}
