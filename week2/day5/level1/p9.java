class BankAccount {
   String accountNumber;
   double balance;

   BankAccount(String accountNumber, double balance) {
       this.accountNumber = accountNumber;
       this.balance = balance;
   }

   void displayDetails() {
       System.out.println("Account Number: " + accountNumber);
       System.out.println("Balance: $" + balance);
   }
}

class SavingsAccount extends BankAccount {
   double interestRate;

   SavingsAccount(String accountNumber, double balance, double interestRate) {
       super(accountNumber, balance);
       this.interestRate = interestRate;
   }

   void displayAccountType() {
       System.out.println("Account Type: Savings Account");
       displayDetails();
       System.out.println("Interest Rate: " + interestRate + "%");
   }
}

class CheckingAccount extends BankAccount {
   double withdrawalLimit;

   CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
       super(accountNumber, balance);
       this.withdrawalLimit = withdrawalLimit;
   }

   void displayAccountType() {
       System.out.println("Account Type: Checking Account");
       displayDetails();
       System.out.println("Withdrawal Limit: $" + withdrawalLimit);
   }
}

class FixedDepositAccount extends BankAccount {
   int durationMonths;

   FixedDepositAccount(String accountNumber, double balance, int durationMonths) {
       super(accountNumber, balance);
       this.durationMonths = durationMonths;
   }

   void displayAccountType() {
       System.out.println("Account Type: Fixed Deposit Account");
       displayDetails();
       System.out.println("Duration: " + durationMonths + " months");
   }
}


public class Main {
   public static void main(String[] args) {
       SavingsAccount sa = new SavingsAccount("154523", 5000.00, 4.5);
       CheckingAccount ca = new CheckingAccount("216456", 3000.00, 1000.00);
       FixedDepositAccount fda = new FixedDepositAccount("464789", 10000.00, 12);

       sa.displayAccountType();
       System.out.println();
       ca.displayAccountType();
       System.out.println();
       fda.displayAccountType();
   }
}