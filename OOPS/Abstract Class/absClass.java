abstract class Abs {
    String str = "MOHAMMAD ASIF NAWAZ";

    abstract String display();
}

class News extends Abs {
    String s = "MOHAMMAD ARIF SHAHNAWAZ";
    String display(){
    return s;
    }
}

public class absClass {
    public static void main(String args[]) {
        News a = new News();
        System.out.println(a.display());
    }

}
