package Generic;

@SuppressWarnings("Unchecked Exception Warining handler")
class Reference<T> {
    private T ref;

    public void setReference(T v) {
        ref = v;
    }

    public T getReference() {
        return ref;
    }
}

class ReferenceArray<T> {
    private T refer[] = (T[]) new Object[5];
    int length = 0;

    public void setRef(T v) {
        refer[length++] = v;
    }

    public void display() {
        for (int i = 0; i < length; i++) {
            System.out.println(refer[i]);
        }
    }
}

public class GenericTwo {
    public static void main(String args[]) {
        Reference<Integer> rf = new Reference();
        rf.setReference(10);
        // System.out.println(rf.getReference());
        ReferenceArray<String> rff = new ReferenceArray();
        rff.setRef("Salaam");
        rff.setRef("Salaam");
        rff.setRef("Salaam");
        rff.setRef("Salaam");
        rff.setRef("Salaam");
        rff.display();

    }
}
