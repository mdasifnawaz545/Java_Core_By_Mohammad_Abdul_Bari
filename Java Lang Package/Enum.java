enum MyEnum {
    CS("MOHAMMAD ASIF NAWAZ", "CSE 05"), IT("MOHAMMAD SIBTAIN RAZA SAFVI", "IT 04"), ECE("MOHAMMAD ADIB", "3RD YEAR");

    MyEnum(String name, String section) {
    };
}

public class Enum {
    public static void main(String args[]) {
        MyEnum m = MyEnum.CS;
        System.out.println(m.getClass());

    }
}
