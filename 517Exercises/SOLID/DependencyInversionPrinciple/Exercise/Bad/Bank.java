public class Bank {

	public void processTransaction(CheckingAccount from, CheckingAccount to, int amount) {
		if (from.getBalance() >= amount) {
			from.withdraw(amount);
			to.deposit(amount);
		}
	}

	public void processTransaction(SavingsAccount from, SavingsAccount to, int amount) {
		if (from.getBalance() >= amount) {
			from.withdraw(amount);
			to.deposit(amount);
		}
	}

	public void processTransaction(CheckingAccount from, SavingsAccount to, int amount) {
		if (from.getBalance() >= amount) {
			from.withdraw(amount);
			to.deposit(amount);
		}
	}

	public void processTransaction(SavingsAccount from, CheckingAccount to, int amount) {
		if (from.getBalance() >= amount) {
			from.withdraw(amount);
			to.deposit(amount);
		}
	}
}
