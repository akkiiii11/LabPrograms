package lab_5.Interface;

public class SavingsAccount implements Account {
	
	String accountNumber;
	private double balance;
	private double interestRate;
	
	public SavingsAccount(String accountNumber, double balance, double interestRate) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	@Override
	public void deposit(double amount) {
		
		balance = balance + amount;
		System.out.println("Deposit in Savings Account: " +amount);
		
	}

	@Override
	public void withdraw(double amount) {

		if (amount <= balance)
		{
			balance = balance - amount;
			System.out.println("Withdrwal in Savings Account: " +amount);
		}
		
		else
		{
			System.out.println("Insufficient Balance");
		}
		
	}

	@Override
	public double calculateInterest() {
		
		return balance = balance + (balance * (interestRate / 100));
	}

	public double viewBalance() {
		
		return balance;
	} 
	
}
