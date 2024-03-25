import java.io.*;

class Student {
    int roll;
    String name;
    String dept;

    public Student(String name, int roll, String dept) {
        this.roll = roll;
        this.name = name;
        this.dept = dept;
    }
}

public class InstanceStoreFile1 {
    public static void main(String args[]) {
        // For Inseting the data/Object of the student into the file

        // try {
        // FileOutputStream fos = new FileOutputStream("Student.txt");
        // Student s1 = new Student ("MOHAMMAD ASIF NAWAZ",22052736, "CSE");
        // PrintStream ps = new PrintStream(fos);
        // ps.println(s1.name);
        // ps.println(s1.roll);
        // ps.println(s1.dept);

        // } catch (IOException e) {
        // System.out.println(e);
        // }

        // For Retriving the data/Object of the student form the file

        try {
            FileInputStream fis = new FileInputStream("Student.txt");
            BufferedReader fr = new BufferedReader(new InputStreamReader(fis));
            Student s2 = new Student(fr.readLine(), Integer.parseInt(fr.readLine()), fr.readLine());

            System.out.println("Name - " + s2.name);
            System.out.println("Roll - " + s2.roll);
            System.out.println("Department - " + s2.dept);

        } catch (IOException ea) {
            System.out.println(ea);
        }

    }
}
