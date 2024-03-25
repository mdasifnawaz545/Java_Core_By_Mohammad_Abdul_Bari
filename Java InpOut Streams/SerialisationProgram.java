import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOError;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable {
    String name;
    int roll;
    String branch;
    String section;
    float cgpa;
    static int subjects;
    transient float unknown;

    public Student() {
    };

    public Student(String name, int roll, String branch, String section, int subjects, float unknown, float cgpa) {
        this.name = name;
        this.roll = roll;
        this.branch = branch;
        this.section = section;
        this.subjects = subjects;
        this.unknown = unknown;
        this.cgpa = cgpa;
    };

}

public class SerialisationProgram {
    public static void main(String args[]) {
        // try {
        // FileOutputStream fos = new FileOutputStream("Serialize.txt");
        // ObjectOutputStream oos = new ObjectOutputStream(fos);
        // Student s = new Student("MOHAMMAD ASIF NAWAZ", 22052736, "CSE", "CSE-05", 6,
        // 123.123f, 9.27f);
        // oos.writeObject(s);

        // } catch (Exception e) {
        // System.out.println(e);
        // }

        try {
            FileInputStream fis = new FileInputStream("Serialize.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Student s;
            s = (Student) ois.readObject();
            System.out.println("Name - " + s.name + "   " + "Roll - " + s.roll + "   " + "Branch - " + s.branch + "   "
                    + "Section - " + s.section + "   " + "Unknown value - " + s.unknown + "   " + "CGPA - " + s.cgpa);

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
