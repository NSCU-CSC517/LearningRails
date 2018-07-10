package dependencyinversion.good.complete;

public interface BasicAccount {
	public int getBalance();
	public void deposit(int amount);
	public void withdraw(int amount);
}
