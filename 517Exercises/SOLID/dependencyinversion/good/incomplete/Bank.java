package dependencyinversion.good.incomplete;

public class Bank {
	
	// ...
	                              //1       //2
	public void processTransaction(___ from, ___ to, int amount) {
		if (from.getBalance() >= amount) {
			from.withdraw(amount);
			to.deposit(amount);
		}
	}

	
	// ...
}
