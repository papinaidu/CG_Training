import java.util.Scanner;
class BankAccount {
	static String bankName;
	static int totalAcc;
	private String accountHolderName;
	private final int accountNumber;
	BankAccount(String accountHolderName, int accountNumber){
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		totalAcc++;
	}
	void display(){
		System.out.println("Account Holder Name: " + accountHolderName);
		System.out.println("Account Number: " + accountNumber);
	}
	void getTotalAccounts(){
		System.out.println("Total number of accounts: " + totalAcc);
	}
}
public class staticBankAccountMain{
	public static void main(String[] args){
		BankAccount obj = new BankAccount("Naidu", 147892);
		if (obj instanceof BankAccount) {
            		System.out.println("obj is Instance of BankAccount");
        	}
		obj.display();
		obj.getTotalAccounts();
		BankAccount obj1 = new BankAccount("Raju", 141823);
		obj1.display();
		obj1.getTotalAccounts();

	}
}