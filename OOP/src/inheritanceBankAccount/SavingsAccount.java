package inheritanceBankAccount;

/*
@SavingsAccount class represent a Subclass of this program, will inherit fields/ methods from @BankAccount
 */
public class SavingsAccount extends BankAccount { //1 Declare class @SavingsAccount, next @extends keyword for @BankAccount

    //2 Declaring private fields of @SavingsAccount
    private double interestRate;

    //3 Declaring @SavingsAccount Constructor
    public SavingsAccount(String accountNumber, double initialBalance, double interestRate) {
        super(accountNumber, initialBalance); //Call @BankAccount superclass constructor for initialization 1
        this.interestRate = interestRate; //Initialization 2

    }

    //4 @SavingsAccount public method (functionality) for apply interestRate
    //@SavingsAccount SRP of @SOLID
    public void applyInterests() {
        double interest = getBalance() * interestRate / 100; //InterestRate calculation stored in interest
        deposit(interest); //To accredit/ pay owed interest directly
    }


}
