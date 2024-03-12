package OOPS.Inheritance;

class Account {
    long ac_no;
    String ac_name;
    int cif_no;
    long ac_balance;
    String address;
    String dob;
    int phno;

    // Account(long ac_no, String ac_name, int cif_no, String address, String dob,
    // int phno) {
    // this.ac_name = ac_name;
    // this.ac_no = ac_no;
    // this.cif_no = cif_no;
    // this.address = address;
    // this.dob = dob;
    // this.phno = phno;
    // }

    long getAcNo() {
        return ac_no;
    }

    String getAcName() {
        return ac_name;
    }

    long getAcBal() {
        return ac_balance;
    }

    void setAcBal(long amt) {
        this.ac_balance = amt;
    }

    String getAddress() {
        return address;
    }

    void setAddress(String address) {
        this.address = address;
    }

    String getDob() {
        return dob;
    }

    int getPhno() {
        return phno;
    }

    void setPhno(int phno) {
        this.phno = phno;
    }
}

class SavingAccount extends Account {
    void deposit(long amt) {
        setAcBal(amt);
    }

    void withdrawl(long amt) {
        setAcBal(getAcBal() - amt);
    }

    String display() {
        return "\nAccount Name - " + ac_name + "\nAccount No - " + ac_no + "\nAccount Balance - " + ac_balance;
    }
}

class LoanAccount extends Account {
    String loan_no;
    long loan_amt;
    int loan_period;
    float loan_int;
    float pay_emi;
    long pay_loan;

    long getLoanAmt() {
        return loan_amt;
    }

    String getLoanNo() {
        return loan_no;
    }

    void setLoanAmt(long amt) {
        this.loan_amt = this.loan_amt + amt;
    }

    int getloanPeriod() {
        return loan_period;
    }

    void setLoanInt(float loan_int) {
        this.loan_int = loan_int;
    }

    float getLoanInt() {
        return loan_int;
    }

    float getEmi() {
        return pay_emi;
    }

    void payEmi(int emi) {
        this.pay_emi = getEmi() - emi;
    }

    void payLoan(long amt) {
        this.pay_loan = getLoanAmt() - amt;
    }

    String display() {
        return "\nAccount Name - " + ac_name + "\nLoan Ammount - " + loan_amt + "\nEMI - " + pay_emi;
    }
}

public class bankAccount {
    public static void main(String args[]) {
        SavingAccount sb = new SavingAccount();
        sb.ac_no = 39869022950l;
        sb.ac_name = "MOHAMMAD ASIF NAWAZ";
        sb.cif_no = 950236445;
        sb.address = "Darbhanga";
        sb.ac_balance = 0l;
        sb.dob = "10-07-2004";
        sb.phno = 776105;
        LoanAccount ln = new LoanAccount();
        ln.ac_no = 56417981387l;
        ln.ac_name = "Loan Member";
        ln.cif_no = 950236445;
        ln.address = "Donar";
        ln.ac_balance = 0l;
        ln.dob = "01-01-2023";
        ln.phno = 776105;
        // System.out.println(ln.display());
        sb.deposit(10000);
        System.out.println(sb.display());
        sb.withdrawl(5000);
        System.out.println(sb.display());

    }

}
