package Generic;

public class GenericOne<T> {
    T ref[] = (T[]) new Object[3];

    public static void main(String args[]) {
        GenericOne<String> go = new GenericOne<>();
        go.ref[0] = "Salaam";
        go.ref[1] = "Salaam";
        go.ref[2] = "Salaam";
        for (int i = 0; i < 3; i++) {
            String str = go.ref[i];
            System.out.println(str);
        }

    }
}
