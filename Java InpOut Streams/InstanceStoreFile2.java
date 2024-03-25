import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class Student {
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

public class InstanceStoreFile2 {
    public static void main(String args[]) {
        // Student s = new Student("MOHAMMAD ASIF NAWAZ", 22052736, "CSE", "CSE-05", 6,
        // 123.123f, 9.27f);
        // try {
        // FileOutputStream fos = new FileOutputStream("Student2.txt");
        // DataOutputStream dos = new DataOutputStream(fos);
        // dos.writeUTF(s.name);
        // dos.writeInt(s.roll);
        // dos.writeUTF(s.branch);
        // dos.writeUTF(s.section);
        // dos.writeInt(s.subjects);
        // dos.writeFloat(s.unknown);
        // dos.writeFloat(s.cgpa);

        // } catch (IOException e) {
        // System.out.println(e);
        // }

        try {
            FileInputStream fis = new FileInputStream("Student2.txt");
            DataInputStream dis = new DataInputStream(fis);
            Student s = new Student();
            s.name = dis.readUTF();
            s.roll = dis.readInt();
            s.branch = dis.readUTF();
            s.section = dis.readUTF();
            s.subjects = dis.readInt();
            s.unknown = dis.readFloat();
            s.cgpa = dis.readFloat();
            System.out.println("Name - " + s.name + "   " + "Roll - " + s.roll + "   " + "Branch - " + s.branch + "   "
                    + "Section - " + s.section + "   " + "Unknown value - " + s.unknown + "   " + "CGPA - " + s.cgpa);

        } catch (IOException e) {
            System.out.println(e);
        }

    }
}