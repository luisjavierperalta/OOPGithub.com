package polymorphismBankAccont;

/*
Main class of the program, holds the main method as entry-point
ALGO:
1 Define main method
2 Create an array of @Account objects init with 2 ( to represent different bankAccount types @SA @CA)
3 To init @balance of each type of account new @SavingsAccount new @CheckingAccount
4 To declare for-each (Enhanced loop) to iterate within the @Account array and print information for each account
 */
public class AccountMain {

    //1
    public static void main(String[] args) {
        //2
        Account[] accounts = new Account[2];
        //3
        accounts[0] = new SavingsAccount(50000.0);
        accounts[1] = new CheckingAccount(25000.0);
        //4
        for (Account account : accounts) {
            System.out.println("Account Balance:" + account.balance);
            System.out.println("InterestRate:" + account.calculateInterest());
        }
    }
}
