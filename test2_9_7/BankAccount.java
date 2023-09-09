package test2_9_7;
import java.util.*;
public class BankAccount {
	int accNo;
	String custName;
	String accType;
	float balance;
	
	public BankAccount(int accNo, String custName, String accType, float initialbalance) {
		super();
		this.accNo = accNo;
		this.custName = custName;
		this.accType = accType;
		
		if(initialbalance <0) {
			throw new NegativeAmountException("balance can not be Negative");
		}
		
		if((accType.equals("Saving") && initialbalance < 1000) || (accType.equals("current") && initialbalance < 5000)) {
			throw new LowBalanceException("Initial balance is below minimum requirement");
		}
		
	}
	public void deposit(float amt) {
		if (amt <0) {
			throw new NegativeAmountException("Please enter amount greater than 0");
		}else {
			
			balance += amt;
		}
		
		
		
	}
	void withdraw(float amt) {
		if
		
		
	}
	float getBalance() {
		return balance;
		
	}

}


class NegativeAmountException extends Exception {

	public NegativeAmountException(String message) {
		
		super(message);
	}
}
class LowBalanceException extends Exception {

	public LowBalanceException(String message) {
		
		super(message);
	}
}