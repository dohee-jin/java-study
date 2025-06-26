package chap1_3.bank;

public class BankMain {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("110-111-222", "taro", 1000000);
        myAccount.deposit(200000);
        myAccount.withdraw(150000);
        myAccount.displayBalance();
    }
}
