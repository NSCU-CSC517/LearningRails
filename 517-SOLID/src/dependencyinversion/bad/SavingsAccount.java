package dependencyinversion.bad;

public class SavingsAccount {
	int balance;
	double interest_rate = 0.003;
	int withdrawals_this_month = 0;
	final int MAX_WITHDRAWALS_PER_MONTH = 6;
	
	public int getBalance() {
		return balance;
	}
	
	public void withdraw(int amount) {
		if (withdrawals_this_month >= MAX_WITHDRAWALS_PER_MONTH)
			throw new UnsupportedOperationException("Too many withdrawals this month! (Federal Reserve Regulation D)");
		if ( balance >= amount) {
			balance -= amount;
			withdrawals_this_month+=1;
		}else
			throw new UnsupportedOperationException("Insufficient Funds!");
		
		
	}
	
	public void deposit(int amount) {
		balance+=amount;
	}
}
