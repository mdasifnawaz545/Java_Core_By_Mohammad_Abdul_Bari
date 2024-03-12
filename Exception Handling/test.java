class expt extends Exception {
    public String toString() {
        return "Exception";
    }
}

public class test {

    public static void main(String[] args) {
        try {
            throw new expt();

        } catch (expt e) {
            System.out.println(e);
        }
    }
}