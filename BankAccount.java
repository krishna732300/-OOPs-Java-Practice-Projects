class BankAccount1 {
  String accountholder;
  String accountnum;
  double balance;
  static String bankName = "Punjab National Bank";

  BankAccount1() {
    this.accountholder = "Sonam";
    this.accountnum = "123456789";
    this.balance = 5000000;
  }

  BankAccount1(String accountholder, String accountnum, double balance) {
    this.accountholder = accountholder;
    this.accountnum = accountnum;
    this.balance = balance;
  }

  public void depo(double amount) {
    if (amount > 0) {
      balance += amount;
      System.out.println("Deposit: $ " + amount);
    } else {
      System.out.println("Invalid deposit amount");
    }
  }

  public void withdraw(double amount) {
    if (amount > 0 && amount <= balance) {
      balance -= amount;
      System.out.println("Withdraw: $ " + amount);
    } else {
      System.out.println("Insufficient balance");
    }
  }

  public void accountdetail() {
    System.out.println("Bank: " + bankName);
    System.out.println("Account Holder: " + accountholder);
    System.out.println("Account Number: " + accountnum);
    System.out.println("Balance: $ " + balance);
  }

  public void balanceDetail() {
    System.out.println("Current Balance: $ " + balance);
  }
}

public class BankAccount {
  public static void main(String[] args) {
    BankAccount1 acc1 = new BankAccount1();
    acc1.accountdetail();
    acc1.depo(2000);
    acc1.withdraw(500);
    acc1.balanceDetail();

    BankAccount1 acc2 = new BankAccount1("Krishna", "123456", 10000);
    acc1.accountdetail();
    acc1.depo(2000);
    acc1.withdraw(500);
    acc1.balanceDetail();

  }
}
