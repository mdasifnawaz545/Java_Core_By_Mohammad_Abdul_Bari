package Multithreading.Synchronization;

import java.util.Scanner;

// Sharable Object or class you may call it whatever you want to call.

class ATM {

    synchronized void BalanceEnquiry(String custName) {
        System.out.println(custName + " Checking Account Balance");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println(
                custName + " Balance has been successfully sent to the registered Mobile Number with the Bank.");

    }

    synchronized void withdrawl(String custName) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Withdrawl Amount : ");
        int amount = scn.nextInt();
        System.out.println("An Amount of Rs." + amount + " has been Withdrawed.");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

}

class cust1 extends Thread {
    ATM A1;

    cust1(ATM data) {
        A1 = data;
    }

    public void run() {
        // System.out.println("What would you like to do ?");
        // System.out.println("1. Balance Enquiry");
        // System.out.println("2. Amount Withdrawl");
        // Scanner scn = new Scanner(System.in);
        // int choice = scn.nextInt();
        // if (choice == 1)
        // A1.BalanceEnquiry("MOHAMMAD ASIF NAWAZ");
        // else if (choice == 2)
        // A1.withdrawl("MOHAMMAD ASIF NAWAZ");
        // else
        // System.out.println("Invalid Choice. Try again...!");

        A1.BalanceEnquiry("MOHAMMAD ASIF NAWAZ");
        A1.withdrawl("MOHAMMAD ASIF NAWAZ");
    }
}

class cust2 extends Thread {
    ATM A2;

    cust2(ATM data) {
        A2 = data;
    }

    public void run() {
        // System.out.println("What would you like to do ?");
        // System.out.println("1. Balance Enquiry");
        // System.out.println("2. Amount Withdrawl");
        // Scanner scn = new Scanner(System.in);
        // int choice = scn.nextInt();
        // if (choice == 1)
        // A2.BalanceEnquiry("MOHAMMAD RIZWAN");
        // else if (choice == 2)
        // A2.withdrawl("MOHAMMAD RIZWAN");
        // else
        // System.out.println("Invalid Choice. Try again...!");

        A2.BalanceEnquiry("MOHAMMAD RIZWAN");
        A2.withdrawl("MOHAMMAD RIZWAN");
    }
}

class cust3 extends Thread {
    ATM A3;

    cust3(ATM data) {
        A3 = data;
    }

    public void run() {
        // System.out.println("What would you like to do ?");
        // System.out.println("1. Balance Enquiry");
        // System.out.println("2. Amount Withdrawl");
        // Scanner scn = new Scanner(System.in);
        // int choice = scn.nextInt();
        // if (choice == 1)
        // A3.BalanceEnquiry("MOHAMMAD KALIM");
        // else if (choice == 2)
        // A3.withdrawl("MOHAMMAD KALIM");
        // else
        // System.out.println("Invalid Choice. Try again...!");

        A3.BalanceEnquiry("MOHAMMAD KALIM");
        A3.withdrawl("MOHAMMAD KALIM");
    }
}

public class ATMMachine {
    public static void main(String args[]) {
        ATM A = new ATM();
        cust1 c1 = new cust1(A);
        cust2 c2 = new cust2(A);
        cust3 c3 = new cust3(A);
        c1.start();
        c2.start();
        c3.start();
    }
}
