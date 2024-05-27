package encapsulationBankAccount;

/*
Java class @BankAccount for representing OOP 2/4 concept of encapsulation in the context of Banking app
In this exercise @BankAccount class represent specifically a @Bank Account
//ALGORITHM OF SEQUENTIAL STEPS
 */
public class BankAccount { //1 Declaring a class for represent a blueprint design @BankAccount for real-world entity (Obj) @Bank Account
    //2 ID & store attributes with @private keyword (Data-Hiding) of obj internal state
    private double balance;

    //3 Deploy public methods for manipulate (set) & access @BankAccount data
    //Using @BankAccount constructor & java's main method (creating new @BankAccount obj)
    public BankAccount(double initialBalance) { //To set initial balance of @BankAccount
        this.balance = initialBalance;
    }

    //3.1 Public method for play (functionality) with data
    public void deposit(double amount) { //To deposit cash
        if (amount > 0) { //Validation Logic
            balance += amount;
        }
    }

    //3.2 Public method (functionality) for withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            //Validation Logic for maintaining the integrity, security, and proper functioning of the bank account system.
            //Only valid operations allowable
            balance -= amount;
        }
    }

    //3.3 Public method @Getter for getting @BankAccount balance (read-only)
    public double getBalance() {
        return balance;
    }
}
