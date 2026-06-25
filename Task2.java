interface ATMService {

    void withdraw(double amount);

    void deposit(double amount);

    void checkBalance();
}

class DBBL implements ATMService {

    double balance = 10000.0;

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdraw Successful: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit Successful: " + amount);
    }

    @Override
    public void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

public class Main {
    public static void main(String[] args) {

        DBBL account = new DBBL();

        account.checkBalance();
        account.deposit(5000);
        account.withdraw(3000);
        account.checkBalance();
    }
}
