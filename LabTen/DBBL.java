interface ATMService {
void withdraw(double amount);
void deposit(double amount);
void checkBalance();
}
public class DBBL implements ATMService {
private double balance;
DBBL(double initialBalance) {
this.balance = initialBalance;
}
@Override
public void withdraw(double amount) {
if (amount <= balance) {
balance -= amount;
System.out.println("Withdrawn : " + amount + " BDT");
} else {
System.out.println("Error: Insufficient balance.");
}
}
@Override
public void deposit(double amount) {
balance += amount;
System.out.println("Deposited : " + amount + " BDT");
}
@Override
public void checkBalance() {
System.out.println("Current Balance : " + balance + " BDT");
}
public static void main(String[] args) {
DBBL account = new DBBL(50000);
System.out.println("----------------------------");
account.checkBalance();
System.out.println("----------------------------");
account.deposit(20000);
account.withdraw(15000);
System.out.println("----------------------------");
account.checkBalance();
System.out.println("----------------------------");
}
}
