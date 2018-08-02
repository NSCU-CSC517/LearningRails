package dependencyinversion.good.incomplete;

public class CheckingAccount implements ___{ //5
	int balance;
	double interest_rate = 0.003;
	
	public int getBalance() {
		return balance;
	}
	
	public void ___(int amount) { //6
		if ( balance >= amount)
			balance -= amount;
		else
			throw new UnsupportedOperationException("Insufficient Funds!");
	}
	
	public void deposit(int amount) {
		balance+=amount;
	}
}
