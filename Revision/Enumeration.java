package Revision;

enum College {
    CSE("2024", 5000), IT("2024", 6000), CSSE("2024", 6000), ME("2024", 6000), CIVIL("2024", 6000);

    String year;
    int students;

    College(String year, int students) {
        this.year = year;
        this.students = students;
    }
}

public class Enumeration {
    public static void main(String args[]) {
        College c = College.CIVIL;
        System.out.println(c.students);
        System.out.println(c.year);
    }

}
