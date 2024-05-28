package inheritanceBankAccount;


public class BankAccountMain {

    //1 Declaring java's main method
    public static void main(String[] args) {
        //2 Creating a new object instance of @SavingsAccount
        SavingsAccount savingsEurope = new SavingsAccount("EU112358", 500000.0, 2.5);
        savingsEurope.deposit(50000.0);
        savingsEurope.applyInterests();
        System.out.println("@SavingsEurope balance:" + savingsEurope.getBalance());

        //2.1 Creating a new object instance of @CheckingAccount
        CheckingAccount checkingEurope = new CheckingAccount("EU11298", 250000.0, 70000.0);
        checkingEurope.withdraw(100000);
        System.out.println("@CheckEurope balance:" + checkingEurope.getBalance());
        System.out.println("Overdraft Limit left:" + checkingEurope.getOverdraftLimit());
        }
    }

