class Subject {
    private String sub_id;
    private String sub_name;
    private int maxMarks;
    private int obtMarks;

    void setname(String sub_name) {
        this.sub_name = sub_name;
    }

    void setmaxMarks(int maxMarks) {
        this.maxMarks = maxMarks;
    }

    void setobtMarks(int obtMarks) {
        this.obtMarks = obtMarks;
    }

    String getname() {
        return sub_name;
    }

    String getid() {
        return sub_id;
    }

    int getmaxMarks() {
        return maxMarks;
    }

    int getobtMarks() {
        return obtMarks;
    }

    public Subject(String sub_id) {
        this.sub_id = sub_id;
    }

    String display() {
        return "\nSubject ID : " + sub_id + "\nSubject Name : " + sub_name + "\nMaximum Marks : " + maxMarks
                + "\nObtained Marks : " + obtMarks;
    }
}

class Student {
    private int roll;
    private String name;
    private String dept;
    private Subject subjects[];

    int getroll() {
        return roll;
    }

    String getname() {
        return name;
    }

    String getdept() {
        return dept;
    }

    Subject[] getsubject() {
        return subjects;
    }

    void setsubject(String sub_id, String sub_name, int maxMarks, int ObtMarks) {
        Subject sub = new Subject(sub_id);
        sub.setmaxMarks(maxMarks);
        sub.setname(sub_name);
        sub.setobtMarks(ObtMarks);
    }

    public Student(int roll, String name, String dept) {
        this.roll = roll;
        this.name = name;
        this.dept = dept;
    }
}

public class subjectStudent {
    public static void main(String args[]) {
        Subject sub[] = new Subject[3];
        sub[0] = new Subject("CS2001");
        sub[0].setname("Data Structure");
        sub[0].setmaxMarks(100);
        sub[0].setobtMarks(90);
        System.out.println(sub[0].display());
        sub[1] = new Subject("MA1001");
        sub[1].setname("Probablity & Statistics");
        sub[1].setmaxMarks(100);
        sub[1].setobtMarks(85);
        System.out.println(sub[1].display());
        sub[2] = new Subject("EC2003");
        sub[2].setname("Digital System and Design");
        sub[2].setmaxMarks(100);
        sub[2].setobtMarks(90);
        System.out.println(sub[2].display());
        
        Student stu = new Student(22052736, "MOHAMMAD ASIF NAWAZ", "CSE");
        stu.setsubject("CS20001", "Data Structure", 100, 90);
        System.out.println("Student Name : " + stu.getname());
        System.out.println("Student Roll : " + stu.getroll());
        System.out.println("Student Department : " + stu.getdept());
        for (Subject subject : stu.getsubject()) {
            System.out.println(subject.display());
        }
    }
}