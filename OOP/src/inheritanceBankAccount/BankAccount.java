package inheritanceBankAccount;

/*
@BankAccount represent a Superclass in the context of OOP Inheritance
ALGORITHM OF SEQUENTIAL STEPS
 */
public class BankAccount { //1 Declare a public class @BankAccount (Real-world concept blueprint)
    //2 Declare private instance fields (connects with OOP 2/4 Encapsulation)
    private String accountNumber;
    private double balance;

    //3 Defining @BankAccount class constructor
    public BankAccount(String accountNumber, double initialBalance) { //Set initial obj state
        this.accountNumber = accountNumber;
        this.balance = initialBalance;

    }

    //4 Creating public methods for access & handling private fields
    public void deposit(double amount) {
        if (amount > 0) { //Validation
            balance += amount;
        }
    }

    //4.1
    public void withdrawal(double amount) {
        if (amount < 0 && amount <= balance) { //Validation
            balance -= amount;
        }
    }

    //4.2 Getter for private field @balance

    public double getBalance() {
        return balance;
    }

    //4.3 Getter for private field @accountNumber

    public String getAccountNumber() {
        return accountNumber;
    }

}
