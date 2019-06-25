public class CheckingAccount implements __________(5)__________ {
	private int balance = 0;
	private double interest_rate = 0.003;

	public int getBalance() {
		return balance;
	}

	public void __________(6)__________ (int amount) {
		if (balance >= amount)
			balance -= amount;
		else
			throw new UnsupportedOperationException("Insufficient Funds!");
	}

	public void deposit(int amount) {
		balance += amount;
	}
}
