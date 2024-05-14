package src.may.ex_14052024;

public class BankAccount {
    String bankName;
    int balance;
    String bankCode;

    BankAccount(){
        bankName = "SBI";
        bankCode = "SBI001";
        balance= 0;
    }

    BankAccount(int balance, String bankCode,String bankName) {
        this.bankName = bankName;
        this.balance = balance;
        this.bankCode = bankCode;
    }

    BankAccount(String bankName, String bankCode) {
        this.bankName = bankName;
        this.bankCode = bankCode;
    }

    void printDetails() {
        System.out.println("Bank Name -> " + bankName);
        System.out.println("Bank Code -> " + bankCode);
        System.out.println("Bal ->" + balance);
    }



}
