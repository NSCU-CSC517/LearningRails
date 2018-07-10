package dependencyinversion.good.complete;

public class Bank {
	
	// ...
	
	public void processTransaction(BasicAccount from, BasicAccount to, int amount) {
		if (from.getBalance() >= amount) {
			from.withdraw(amount);
			to.deposit(amount);
		}
	}

	
	// ...
}
