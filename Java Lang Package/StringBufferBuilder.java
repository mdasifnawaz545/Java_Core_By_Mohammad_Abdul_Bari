class MyData {
    String s = new String(" ASIF NAWAZ");

    public String display() {
        return s;
    }
}

class One extends Thread {
    MyData d1;

    One(MyData obj) {
        d1 = obj;
    }

    public void run() {
        
            System.out.println("One Thread : " + d1.display());
            
        
    }

}

class Two extends Thread {
    MyData d2;

    Two(MyData obj) {
        d2 = obj;
    }

    public void run() {
    
            System.out.println("Two Thread : " + d2.display());
            
        
    }

}

public class StringBufferBuilder {
    public static void main(String args[]) {
        // String str = "MOHAMMAD ASIF NAWAZ";
        // str.concat(str);
        // System.out.println(str);
        // StringBuffer s = new StringBuffer("MOHAMMAD ASIF NAWAZ");
        // s.append(" " + str);
        // System.out.println(s);
        MyData D = new MyData();
        One o1 = new One(D);
        Two o2 = new Two(D);
        o1.start();
        o2.start();

    }
}
