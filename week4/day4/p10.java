class InsufficientBalanceException extends Exception{
   InsufficientBalanceException(String message){
       super(message);
   }
}
class BankManagement {
   private double balance;
   BankManagement(double balance){
       this.balance = balance;
   }
   void withdraw(double amount) throws IllegalArgumentException, InsufficientBalanceException{
       if (amount<0){
           throw new InsufficientBalanceException("Amount Should be Positive");
       }
       if(balance<amount){
           throw new IllegalArgumentException("Insufficient balance!");
       }
       balance = balance-amount;
   }
   void display(){
       System.out.println("Current balance: " + balance);
   }
}

public class Main {
   public static void main(String[] args)  {
       BankManagement bank = new BankManagement(100);
       try{
           bank.withdraw(-1);
           bank.display();
       } catch (InsufficientBalanceException e) {
           System.out.println("Error: " + e.getMessage());
       }
       catch (IllegalArgumentException e){
           System.out.println("Invalid Amount: " + e.getMessage());
       }
   }
}