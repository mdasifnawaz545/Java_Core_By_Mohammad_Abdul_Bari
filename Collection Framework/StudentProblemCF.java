import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

import javax.swing.RowFilter.Entry;

class Account implements Serializable {
    long ac_no;
    String ac_name;
    float ac_bal;

    public Account(long ac_no, String ac_name, float ac_bal) {
        this.ac_bal = ac_bal;
        this.ac_name = ac_name;
        this.ac_no = ac_no;
    }

    public String toString() {
        return "A/c Name: " + ac_name + "\nA/c No: " + ac_no + "\nA/c Balance: " + ac_bal;
    }
}

public class StudentProblemCF {
    public static void main(String args[]) throws Exception {
        int choice;
        String ac_name;
        long ac_no;
        float ac_bal;
        Scanner scn = new Scanner(System.in);
        HashMap<Long, Account> hm = new HashMap<>(100, 0.5f);
        Account ac;
        FileOutputStream fos = new FileOutputStream("Account.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        try {
            FileInputStream fis = new FileInputStream("Account.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            int count = ois.readInt();
            for (int i = 0; i < count; i++) {
                ac = (Account) ois.readObject();
                hm.put(ac.ac_no, ac);
            }
        } catch (IOException e) {
            System.out.println(e);
        }

        while (true) {

            System.out.println("1. Create Account");
            System.out.println("2. Delete Account");
            System.out.println("3. View Account");
            System.out.println("4. View All Account");
            System.out.println("5. Save Account");
            System.out.println("6. Exit");
            System.out.println("Enter your Choice: ");
            choice = scn.nextInt();
            switch (choice) {
                case 1:
                System.out.println("Enter A/C Name : ");
                ac_name = scn.nextLine();
                    System.out.println("Enter A/C Number : ");
                    ac_no = scn.nextLong();
                    System.out.println("Enter A/C Balance : ");
                    ac_bal = scn.nextFloat();
                    Account a = new Account(ac_no, ac_name, ac_bal);
                    hm.put(ac_no, a);
                    break;
                case 2:
                    System.out.println("Enter A/C No: ");
                    ac_no = scn.nextLong();
                    hm.remove(ac_no);
                    break;
                case 3:
                    System.out.println("Enter A/C No: ");
                    ac_no = scn.nextLong();
                    ac = hm.get(ac_no);
                    System.out.println(ac);
                    break;
                case 4:
                    for (Account acn : hm.values()) {
                        System.out.println(acn);
                    }
                    break;
                case 5:
                    oos.writeInt(hm.size());
                    for (Account acn : hm.values()) {
                        oos.writeObject(acn);
                    }
                    break;
                case 6:
                    oos.writeInt(hm.size());
                    for (Account acn : hm.values()) {
                        oos.writeObject(acn);
                    }
                    System.exit(1);
                    break;
                default:
                    System.out.println("Wrong Choice");
                    break;
            }

        }
        // oos.flush();
        // try{
        // oos.close();
        // ois.close();
        // fis.close();
        // fos.close();
        // }catch(IOException ioe){
        // System.out.println(ioe);
        // }

    }

}
