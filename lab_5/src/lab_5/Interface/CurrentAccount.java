package lab_5.Interface;

public class CurrentAccount implements Account {
	
	String accountNumber;
	private double balance;
	private double interestRate;

	public CurrentAccount(String accountNumber, double balance, double interestRate) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.interestRate = interestRate;
	}

	@Override
	public void deposit(double amount) {
		
		balance = balance + amount;
		System.out.println("Deposit in Current Account: " +amount);
		
	}

	@Override
	public void withdraw(double amount) {
		
		if (amount <= balance)
		{
			balance = balance - amount;
			System.out.println("Withdrwal in Current Account: " +amount);
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

	@Override
	public double viewBalance() {
		
		return balance;
	}
	
}
