public class BankAccount {
String accountNumber;
String accountHolderName;
double balance;
static String bankName = "Sonali Bank";
BankAccount(String accountNumber, String accountHolderName, double balance) {
this.accountNumber = accountNumber;
this.accountHolderName = accountHolderName;
this.balance = balance;
}
static void showBankName() {
System.out.println("Bank Name : " + bankName);
}
void displayAccount() {
System.out.println("Account Number : " + accountNumber);
System.out.println("Account Holder : " + accountHolderName);
System.out.println("Balance : " + balance + " BDT");
System.out.println("----------------------------");
}
public static void main(String[] args) {
BankAccount.showBankName();
System.out.println("----------------------------");
BankAccount acc1 = new BankAccount("1001", "Mohammad Ayman", 50000);
BankAccount acc2 = new BankAccount("1002", "Reza ahamed", 75000);
acc1.displayAccount();
acc2.displayAccount();
}
}
