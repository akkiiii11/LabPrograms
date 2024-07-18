//Write a Java program to create an abstract class BankAccount with abstract methods deposit() and withdraw(). Create subclasses: SavingsAccount and CurrentAccount that extend the BankAccount class and implement the respective methods to handle deposits and withdrawals for each account type.


// package declaration
package lab_5;

//abstract class BankAccount declaration
abstract class BankAccount
{
	// protected fields for account number and balance
	//Protected members are accessible within the same class and its subclasses, but not from other classes or packages.
	protected String accountNumber;
	protected double balance;
	
	// constructor to initialize account number and balance
	// constructor is same as class name
	public BankAccount(String accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	// abstract method to deposit amount
	abstract void deposit(double amount);
	
	// abstract method to withdraw amount
	abstract void withdraw(double amount);
	
	// public method to get balance
	public double getBalance()
	{
		return balance;
	}
}

//class SavingsAccount extends BankAccount
class SavingsAccount extends BankAccount
{

	// constructor to initialize SavingsAccount
	public SavingsAccount(String accountNumber, double balance) {
		super(accountNumber, balance);
		
	}

	// overriding the deposit method for SavingsAccount
	@Override
	void deposit(double amount) {
		
		//adding new amount
		balance = balance + amount;
		System.out.println("Deposit of " +amount + " into Saving Account Completed.");
		
	}

	// overriding the withdraw method for SavingsAccount
	@Override
	void withdraw(double amount) {
		
		//to check new amount is less than balance
		if (amount <= balance)
		{
			balance = balance - amount;
			System.out.println("Withdrwal of " +amount+ " into Saving Account Completed.");
		}
		
		else
		{
			System.out.println("Insufficient Balance");
		}
		
	}
	
	
}

//class CurrentAccount access all methods of BankAccount
class CurrentAccount extends BankAccount
{

	// constructor to initialize CurrentAccount
	public CurrentAccount(String accountNumber, double balance) {
		super(accountNumber, balance);
		
	}

	// overriding the deposit method for CurrentAccount
	@Override
	void deposit(double amount) {
		
		balance = balance + amount;
		System.out.println("Deposit of " +amount + "into Current Account Completed.");
		
				
	}

	// overriding the withdraw method for CurrentAccount
	@Override
	void withdraw(double amount) {
		
		if (amount <= balance)
		{
			balance = balance - amount;
			System.out.println("Withdrwal of " +amount+ "into Current Account Completed.");
		}
		
		else
		{
			System.out.println("Insufficient Balance");
		}
		
	}
		
}

public class BankAccountMain {

	public static void main(String[] args) {
		
		// creating a SavingsAccount object
		SavingsAccount sa = new SavingsAccount("SA-8711", 10000);
		
		// depositing 5000 into the SavingsAccount
		sa.deposit(5000);
		
		// printing the account number and balance of the SavingsAccount
		System.out.println("\nAccount Number is: " +sa.accountNumber );
		System.out.println("Total Savings Account Balance is: " +sa.getBalance());
		
		System.out.println();
		
		// withdrawing 100 from the SavingsAccount
		sa.withdraw(100);
		
		// printing the updated balance of the SavingsAccount
		System.out.println("Total Savings Account Balance is: " +sa.getBalance()+ "\n");
		
		// creating a CurrentAccount object
		CurrentAccount ca = new CurrentAccount("CA-9856", 50000);
		
		// depositing 10000 into the CurrentAccount
		ca.deposit(10000);
		
		// printing the account number and balance of the CurrentAccount
		System.out.println("\nAccount Number is: " +ca.accountNumber );
		System.out.println("Total Savings Account Balance is: " +ca.getBalance());
		
		System.out.println();
		
		// withdrawing 500 from the CurrentAccount
		ca.withdraw(500);
		
		// printing the updated balance of the CurrentAccount
		System.out.println("Total Savings Account Balance is: " +ca.getBalance());

	}

}

/*Dry run
 
 Deposit of 5000.0 into Saving Account Completed.

Account Number is: SA-8711
Total Savings Account Balance is: 15000.0

Withdrwal of 100.0 into Saving Account Completed.
Total Savings Account Balance is: 14900.0

Deposit of 10000.0into Current Account Completed.

Account Number is: CA-9856
Total Savings Account Balance is: 60000.0

Withdrwal of 500.0into Current Account Completed.
Total Savings Account Balance is: 59500.0

 
 */
