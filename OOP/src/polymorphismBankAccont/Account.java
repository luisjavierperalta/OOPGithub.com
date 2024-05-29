package polymorphismBankAccont;

/*
@BANKING EXERCISE
@Account abstract class to represent Superclass (Parent class) of @OOP, Polymorphism B) @MethodOverriding
ALGORITHM OF SEQUENTIAL STEPS
 */

public abstract class Account { //1 Declare @Account public class as @abstract (blueprint for subClasses)
    //2 Declare class fields
    protected double balance; //Accessible to subClasses, holds @Account balance

    //3 Declare @Account class constructor
    public Account(double balance) {
        this.balance = balance;
    }

    //3 Declare @Account class @abstract method (no implementation) (implemented by subClasses)
    public abstract double calculateInterest();
}
