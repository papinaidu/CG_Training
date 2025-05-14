class Bank {
    String bankName;

    Bank(String bankName) {
        this.bankName = bankName;
    }

    void openAccount(Customer customer, Account account) {
        customer.addAccount(account);
        System.out.println("Account opened for " + customer.getName() + " at " + bankName);
    }
}

class Account {
    int accountNumber;
    double balance;

    Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    double getBalance() {
        return balance;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance.");
        }
    }
}

class Customer {
    String name;
    int id;
    ArrayList<Account> accounts = new ArrayList<>();

    Customer(String name, int id) {
        this.name = name;
        this.id = id;
    }

    String getName() {
        return name;
    }

    void addAccount(Account account) {
        accounts.add(account);
    }

    void viewBalance() {
        for (Account account : accounts) {
            System.out.println("Account number: " + account.accountNumber + " | Balance: " + account.getBalance());
        }
    }
}

public class BankSystem {
    public static void main(String[] args) {
        Bank bank = new Bank("XYZ Bank");
        Customer customer = new Customer("John Doe", 101);

        Account account1 = new Account(1001, 5000);
        Account account2 = new Account(1002, 15000);

        bank.openAccount(customer, account1);
        bank.openAccount(customer, account2);

        customer.viewBalance();
    }
}