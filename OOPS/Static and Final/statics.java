import java.sql.Date;

class Student {
    private String roll;

    String getRoll(){
        return roll;
    }
    Student() {
        roll = setRollNumber();
    }

    static int count = 1;

    private String setRollNumber() {

        String str = "KIIT" + (24) + "-" + (count);
        count++;
        return str;
    }
}

public class statics {
    public static void main(String args[]) {
        Student s1 = new Student();
        System.out.println(s1.getRoll());
        Student s2 = new Student();
        System.out.println(s2.getRoll());
        Student s3 = new Student();
        System.out.println(s3.getRoll());
        Student s4 = new Student();
        System.out.println(s4.getRoll());
    }
}
