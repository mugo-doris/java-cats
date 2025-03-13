// Base class BankAccount
abstract class BankAccount {
  protected double balance;

  // Constructor to initialize balance
  public BankAccount(double initialBalance) {
      this.balance = initialBalance;
  }

  // Method to deposit money
  public void deposit(double amount) {
      if (amount > 0) {
          balance += amount;
          System.out.println("Deposited: $" + amount + ". New balance: $" + balance);
      } else {
          System.out.println("Invalid deposit amount.");
      }
  }

  // Abstract method for withdrawal
  public abstract void withdraw(double amount);
}

// Subclass SavingsAccount
class SavingsAccount extends BankAccount {
  // Constructor
  public SavingsAccount(double initialBalance) {
      super(initialBalance);
  }

  // Override withdraw method
  @Override
  public void withdraw(double amount) {
      if (amount > 0 && (balance - amount) >= 100) {
          balance -= amount;
          System.out.println("Withdrawn: $" + amount + ". New balance: $" + balance);
      } else {
          System.out.println("Withdrawal failed. Minimum balance of $100 must be maintained.");
      }
  }
}

// Subclass CheckingAccount
class CheckingAccount extends BankAccount {
  // Constructor
  public CheckingAccount(double initialBalance) {
      super(initialBalance);
  }

  // Override withdraw method
  @Override
  public void withdraw(double amount) {
      if (amount > 0 && (balance - amount - 1) >= 0) {
          balance -= (amount + 1); // Deduct amount + $1 fee
          System.out.println("Withdrawn: $" + amount + " with a $1 fee. New balance: $" + balance);
      } else {
          System.out.println("Withdrawal failed. Insufficient funds.");
      }
  }
}

// Main class to demonstrate functionality
public class Main {
  public static void main(String[] args) {
      // Create a SavingsAccount object
      SavingsAccount savings = new SavingsAccount(500);
      savings.deposit(200); // Deposit $200
      savings.withdraw(300); // Withdraw $300 (allowed)
      savings.withdraw(400); // Withdraw $400 (fails due to minimum balance rule)

      System.out.println(); // Separator

      // Create a CheckingAccount object
      CheckingAccount checking = new CheckingAccount(300);
      checking.deposit(100); // Deposit $100
      checking.withdraw(50); // Withdraw $50 (deducts $1 fee)
      checking.withdraw(400); // Withdraw $400 (fails due to insufficient funds)
  }
}
