package encapsulationBankAccount;

//Java's main class for using @BankAccount class in real-world settings

public class BankAccountMain {
    //1 Declare java's program main method
    public static void main(String[] args) {
        //2 Create a new obj (instance of @BankAccount class)
        BankAccount account = new BankAccount(100000.0);

        //Deposit $50.000.00
        account.deposit(50000.0);
        System.out.println("Balance updated:" + account.getBalance());

        //Withdraw $10.000.00
        account.withdraw(5000.0);
        System.out.println("Balance updated:"+ account.getBalance());

        //Testing withdrawal validation checks for overflow
        account.withdraw(180000.0);
        System.out.println("Failed withdrawal. Funds requests exceeds account balance. Balance update:" + account.getBalance());
    }
}
