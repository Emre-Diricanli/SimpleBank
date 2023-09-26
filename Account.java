public class Account {
    private static int accountNumber = 10001;
    public static double accountBalance;

    public Account(){
        accountNumber++;
    }

    public Account (double accountBalance){
        accountNumber++;
        this.accountBalance = accountBalance;
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    public double getAccountBalance(){
        return accountBalance;
    }

    public static void setAccountBalance(double accountBalance) {
        Account.accountBalance = accountBalance;
    }

    public void withdraw(double wAmount){
        accountBalance -= wAmount;
    }

    public void deposit(double dAmount){
        accountBalance += dAmount;
    }
}
