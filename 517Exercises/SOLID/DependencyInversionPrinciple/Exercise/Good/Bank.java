public class Bank {
	public void processTransaction(__________(1)__________ from, __________(2)__________ to, int amount) {
		if (from.getBalance() >= amount) {
			from.withdraw(amount);
			to.deposit(amount);
		}
	}
}
