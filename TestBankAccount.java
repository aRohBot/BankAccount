public class TestBankAccount {
    public static void main(String[] args){
        BankAccount customer = new BankAccount();
        customer.depositToSavings(2000);
        customer.depositToChecking(1000);
        customer.displayAllBalance();
        System.out.println(customer.getAccountNumber());
    }
}
