import java.util.Random;

public class BankAccount{
    public static int numOfAccounts =0;
    public static double totalBalance = 0;

    private int accountNumber;
    private double checkingBalance;
    private double savingsBalance;

    public BankAccount() {
        this.accountNumber = BankAccount.generateAccountNum();
        this.checkingBalance = 0;
        this.savingsBalance = 0;
        numOfAccounts ++;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public double getCheckingBalance() {
        return checkingBalance;
    }
    public void setCheckingBalance(double checkingBalance) {
        this.checkingBalance = checkingBalance;
    }
    public double getSavingsBalance() {
        return savingsBalance;
    }
    public void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }
    public static int getNumOfAccounts() {
        return numOfAccounts;
    }
    public static void setNumOfAccounts(int numOfAccounts) {
        BankAccount.numOfAccounts = numOfAccounts;
    }
    public static double getTotalBalance() {
        return totalBalance;
    }
    public static void setTotalBalance(double totalBalance) {
        BankAccount.totalBalance = totalBalance;
    }

    public void depositToChecking(double deposit){
        this.setCheckingBalance(this.checkingBalance + deposit);
        BankAccount.setTotalBalance(BankAccount.totalBalance + deposit);
    }
    public void depositToSavings(double deposit){
        this.setSavingsBalance(this.savingsBalance + deposit);
        BankAccount.setTotalBalance(BankAccount.totalBalance + deposit);
    }
    public void withdrawFromChecking(double withdraw){
        if (this.getCheckingBalance()-withdraw <= 0){
            System.out.println("Insufficent Funds!");
        } else{
            this.setCheckingBalance(this.checkingBalance - withdraw);
            BankAccount.setTotalBalance(BankAccount.totalBalance - withdraw);
        }
    }
    public void withdrawFromSavings(double withdraw){
        this.setSavingsBalance(this.savingsBalance - withdraw);
        BankAccount.setTotalBalance(BankAccount.totalBalance - withdraw);
    }

    public void displayAllBalance(){
        System.out.println(String.format("Savings: %.2f, Checking: %.2f", this.savingsBalance, this.checkingBalance));
    }

    private static int generateAccountNum(){
        Random randGenerator = new Random();
        int randomId = randGenerator.nextInt(1000000000) + 999999999;
        return randomId;
    }
}