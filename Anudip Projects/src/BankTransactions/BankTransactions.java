package BankTransactions;


public class BankTransactions {
    public static void main(String[] args) {
        Bank bankAccount = new Bank();


        bankAccount.withdraw(300);
        bankAccount.withdraw(800);
        bankAccount.deposit(500);
        bankAccount.displayBalance();
    }
}
class Bank {

    int amount;

    public Bank() {
        this.amount = 1000;
    }

    public void withdraw(int withdrawalAmount) {
        if (withdrawalAmount <= amount) {
            amount -= withdrawalAmount;
            System.out.println("Withdrawal successful." + withdrawalAmount);
        } else {
            System.out.println(" Withdrawal failed.");
        }
    }

    public void deposit(int depositAmount) {
        amount = depositAmount;
        System.out.println("Deposited:" + depositAmount);
    }
    public void displayBalance() {
        System.out.println("Total Balance:" + amount);
    }
}

