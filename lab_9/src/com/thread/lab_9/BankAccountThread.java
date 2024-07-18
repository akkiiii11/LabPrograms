//Write a Java program that creates a bank account with concurrent deposits and withdrawals using threads.

package com.thread.lab_9;

public class BankAccountThread {
	
	// Private variable to store the account balance
	private double balance;

	// Method to deposit money into the account
	public void deposit(double amount) {
		try {
			// Add the deposited amount to the balance
			balance = balance + amount;
			System.out.println("Deposit: " + amount);
			System.out.println("Balance After Deposit: " + balance);
		} catch (ArithmeticException e) {
			// Handle arithmetic exceptions, but in this case, it's empty
		}
	}

	// Method to withdraw money from the account
	public void withdraw(double amount) {
		try {
			// Check if the balance is sufficient for withdrawal
			if (balance >= amount) {
				// Subtract the withdrawn amount from the balance
				balance = balance - amount;
				System.out.println("Withdrawal: " + amount);
				System.out.println("Balance After Withdrawal: " + balance);
			} else {
				// Insufficient balance, cancel the withdrawal
				System.out.println("Insufficient Balance. Withdrawal Cancelled.");
			}
		} catch (ArithmeticException e) {
			// Handle arithmetic exceptions, but in this case, it's empty
		}
	}

	public static void main(String[] args) {
		// Create a BankAccountThread instance
		BankAccountThread account = new BankAccountThread();

		// Create threads for deposit and withdrawal operations
		Thread deposit1 = new Thread(() -> account.deposit(1000));
		Thread deposit2 = new Thread(() -> account.deposit(300));

		Thread withdrawal1 = new Thread(() -> account.withdraw(150));
		Thread withdrawal2 = new Thread(() -> account.withdraw(1200));

		// Start the threads
		deposit1.start();
		deposit2.start();

		withdrawal1.start();
		withdrawal2.start();
	}
}

/*Dry Run

Insufficient Balance. Withdrawal Cancelled.
Withdrawal: 150.0
Deposit: 300.0
Deposit: 1000.0
Balance After Withdrawal: 1150.0
Balance After Deposit: 1150.0
Balance After Deposit: 1150.0

 */
