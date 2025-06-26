package chap1_3.bank;

public class BankAccount {
    String accountNumber;
    String owner;
    double balance;

    BankAccount(String account, String name, double money) {
        accountNumber = account;
        owner = name;
        balance = money;
    }

    void deposit(double amount) {
        balance = balance + amount;
    }

    void withdraw(double amount) {
        if(balance < amount) {
            System.out.println("잔액 부족!!");
        }
        balance = balance - amount;
        System.out.println(amount + "를 인출했습니다.");
    }

    void displayBalance() {
        System.out.println("현재 잔고: " + balance);
    }


}
