package polymorphismBankAccont;

/*
1/2 subClasses of @Account class.

 */
public class SavingsAccount extends Account { //1 Declare @SavingsAccount public class, next extends @Account
    //2 @SA class own fields specifications
    private double interestRate = 0.03; //Fixed interest rate for @SavingsAccount ( rep real-world bankAccount)
    //3 @SA class constructor
    public SavingsAccount(double balance) {
        super(balance); //Calling the @SuperClass constructor to init @balance of bank account
    }

    //3
    @Override
    public double calculateInterest() { //return calculation of interestRate
        return balance * interestRate;
    }
}
