package polymorphismBankAccont;

/*
2/2 subClass of @Account superClass, represent a type of bankAccount with own @interestRate
Tasks:
1 To extends @Account superClass
2 Apply own specifications, implementation of @calculateInterest() of @Account Class
 */
public class CheckingAccount extends Account{//1 Declare @CA public class, next extends @Account class
    //2 @CA private fields with own specs
    private double interestRate = 0.01; //Fixed interestRate for any @CheckingAccount (real-world @bankAccount)
    //3 To declare @CA class constructor
    public CheckingAccount(double balance) { //Call @Account superClass constructor for init @balance
        super(balance);
    }

    //4 @Override @Account superClass @calculateInterest();
    @Override
    public double calculateInterest() {
        return balance * interestRate;
    }
}
