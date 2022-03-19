package banking;

/**
 * REPRESENTS CHECKING/SAVINGS ACCOUNT FOR A CUSTOMER
 * @author aarenandy
 *
 */

public class BankAccount {
	
	
	//instance vars
	
	/**
	 * Type of account (checkings or savings)
	 */
	String accountType;
	
	/**
	 * Balance for bank account
	 */
	
	double balance;
	
	/**
	 * Customer for this account
	 */
	
	Customer customer;
	
	//constructor 
	
	/**
	 * Creates bank account of given type for given customer
	 * @param accountType for bank account
	 * @param customer for bank account
	 */
	
	public BankAccount(String accountType, Customer customer) {
		this.accountType = accountType;
		this.customer = customer;
	}
	
	//methods
	
	
	/**
	 * Deposits given amount
	 * @param amount to add to balance
	 */
	
	public void deposit(double amount) {
		this.balance += amount;
	}
	
	
	/**
	 * Withdraws given amount from balance
	 * @param amount to withdraw
	 * @throws Exception if amount is greater than available balance
	 */
	public void withdraw(double amount) throws Exception {
		if (amount > this.balance) {
			throw new Exception("Amount is greater than available balance.");
		}
		this.balance -= amount;
	}
	
	/**
	 * Returns account type and balance for account
	 * @return string with all bank acc info
	 */
	public String getAccountInfo() {
		return this.accountType + ": " + this.balance;
	}
	
	
	/**
	 * Returns customer name and address
	 * @return string with all customer info
	 */
	public String getCustomerInfo() {
		return this.customer.getName() + " from " + this.customer.getAddress();
	}
	

	
	
	
	
}
