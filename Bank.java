package banking;

import java.util.Scanner;

/**
 * Represents bank for managing customers and their bank accounts
 * @author aarenandy
 *
 */

public class Bank {

	public static void main(String[] args) {
		
		//creates new instance of bank class
		Bank bank = new Bank();
		
		//calls run method in bank class
		bank.run();

	}
	
	//Runs the program by initializing and managing bank accounts and customers
	public void run() {
		System.out.println("Welcome to the bank. What is your name? ");
		
		//scanner created for customer input
		Scanner scanner = new Scanner(System.in);
		
		//gets next token (name)
		String name = scanner.next();
		
		System.out.println("Hello! " + name + " We arecreating checking and savings accounts for you.");
		
		//create customer with given name
		Customer customer = new Customer(name);
		
		//get address
		System.out.println("What is your adddress? ");
		
		//get next customer address
		String address = scanner.next();
		
		
		//set customer address
		customer.setAddress(address);
		
		//create checking account for customer
		BankAccount checkingAccount = new BankAccount("checking", customer);
		
		//create savings account for customer
		BankAccount savingsAccount = new BankAccount("savings", customer);
		
		//gets and prints customer info associated with checking account
		System.out.println();
		System.out.println("Customer info: ");
		System.out.println(checkingAccount.getCustomerInfo());
		
		//get and print account info for checking
		System.out.println("checking account: ");
		System.out.println(checkingAccount.getAccountInfo());

		//get and print account info for savings
		System.out.println("savings account: ");
		System.out.println(savingsAccount.getAccountInfo());
		
		//deposits 
		
		//into checking
		System.out.println();
		System.out.println("Amount (decimal) to deposit into your checking account?");
		//get amount of deposit
		double amount = scanner.nextDouble();
		//deposit into checking account
		checkingAccount.deposit(amount);
		
		//into savings
		System.out.println();
		System.out.println("Amount (decimal) to deposit into your savings account?");
		//get amount of deposit
		amount = scanner.nextDouble();
		//deposit into checking account
		savingsAccount.deposit(amount);
		
		
		//print new balances
		System.out.println(checkingAccount.getAccountInfo());
		System.out.println(savingsAccount.getAccountInfo());

		//withdrawals from account
		
		//from checking
		System.out.println();
		System.out.println("Amount (decimal) to withdraw from your checking account?");
		amount = scanner.nextDouble(); // gets next token as double
		
		try {
			checkingAccount.withdraw(amount); //withdraw from checking
		} catch (Exception e) {
			//e.printStackTrace();
			
			//Prints custom error message from withdraw method
			System.out.println(e.getMessage());
		} 
		
		//from savings
		System.out.println();
		System.out.println("Amount (decimal) to withdraw from your savings account?");
		amount = scanner.nextDouble(); // gets next token as double
		
		try {
			savingsAccount.withdraw(amount); //withdraw from savings
		} catch (Exception e) {
			//e.printStackTrace();
			
			//Prints custom error message from withdraw method
			System.out.println(e.getMessage());
		} 
		
		System.out.println(checkingAccount.getAccountInfo());
		System.out.println(savingsAccount.getAccountInfo());
		
		scanner.close();
	}

}
