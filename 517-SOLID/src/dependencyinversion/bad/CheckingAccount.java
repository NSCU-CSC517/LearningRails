package dependencyinversion.bad;

public class CheckingAccount {
	int balance;
	double interest_rate = 0.003;
	
	public int getBalance() {
		return balance;
	}
	
	public void removeMoney(int amount) {
		if ( balance >= amount)
			balance -= amount;
		else
			throw new UnsupportedOperationException("Not enough money!");
	}
	
	public void addMoney(int amount) {
		balance+=amount;
	}
}
