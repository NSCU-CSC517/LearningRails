// public class SavingsAccount implements __________(7)__________ {
public class SavingsAccount implements BasicAccount {
	private int balance = 0;
	private double interest_rate = 0.0125;
	private int withdrawals_this_month = 0;
	private final int MAX_WITHDRAWALS_PER_MONTH = 6;

	public int getBalance() {
		return balance;
	}

	// public void __________(8)__________(int amount) {
	public void withdraw(int amount) {
		if (withdrawals_this_month >= MAX_WITHDRAWALS_PER_MONTH)
			throw new UnsupportedOperationException("Too many withdrawals this month! (US Regulation D)");
		if (balance >= amount) {
			balance -= amount;
			withdrawals_this_month += 1;
		} else
			throw new UnsupportedOperationException("Insufficient Funds!");
	}

	public void deposit(int amount) {
		balance += amount;
	}
}
