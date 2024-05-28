package inheritanceBankAccount;

/*
@CheckingAccount subclass of @BankAccount
 */
public class CheckingAccount extends BankAccount { //1 Declaring public class @CheckingAccount, next extends @BankAccount Superclass
    //2 Declaring private fields of @CheckingAccount
    private double overdraftLimit;
    /*
   @BankAccount lacks the funds to cover a withdrawal, but the bank
   allows the transaction to go through anyway.
   The overdraft allows the customer to continue paying bills even when there is insufficient money.
     */

    //3 Defining @CheckingAccount Constructor
    public CheckingAccount(String accountNumber, double initialBalance, double overdraftLimit) {
        super(accountNumber, initialBalance); //Call @Superclass Constructor for init 1
        this.overdraftLimit = overdraftLimit; //@Subclass Init 2
    }

    //@Override @Superclass method, for adding overdraftLimit functionality
    public void withdraw(double amount) {
        if (amount > 0 && amount <= getBalance() + overdraftLimit) {
            double newBalance = getBalance() - amount; //If true, perform successfully operation
            if (newBalance < 0) {
                overdraftLimit += newBalance; //Lowering overdraft limit by the overdraft amount (newBalance is negative)
            }
            super.withdrawal(amount);
            // Call the superclass's withdraw method to perform the actual withdrawal
            //Placing super.withdraw(amount); within the if statement ensures that the
            //withdrawal is only processed when it is valid.
        }
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }
}
