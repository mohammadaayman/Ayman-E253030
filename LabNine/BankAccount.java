public class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private double balance;

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Error: Balance cannot be negative.");
        }
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount();

        acc.setAccountHolder("Ayman");
        acc.setAccountNumber("12345");
        acc.setBalance(5000);

        System.out.println("Account Holder: " + acc.getAccountHolder());
        System.out.println("Account Number: " + acc.getAccountNumber());
        System.out.println("Balance: " + acc.getBalance());
    }
}
