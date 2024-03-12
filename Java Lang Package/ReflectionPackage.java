import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

class MyClass {
    int h = 10;
    String str = "new name";
    private float f = 123.55f;

    MyClass(int x, float y) {
    };

    MyClass() {
    };

    void meth1(int h, String str) {
    };

    void meth() {
    };

}

public class ReflectionPackage {
    public static void main(String args[]) {
        MyClass m = new MyClass();
        Class cc = m.getClass();
        Class c = MyClass.class;

        Method mm[] = c.getMethods();
        Parameter p[] = mm[1].getParameters();
        for (Parameter parameter : p) {
            System.out.println(parameter);
        }
    }
}
