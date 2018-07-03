package dependencyinversion.good.complete;

public interface BasicAccount {
	public int getBalance();
	public void addMoney(int amount);
	public void removeMoney(int amount);
}
