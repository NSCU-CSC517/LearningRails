class Balance {
	__________(1)__________ Balance firstInstance = null;
	private int balance;

	__________(2)__________ {
		this.balance = balance;
	}

	public static Balance getInstance() {
		if(__________(3)__________) {
			firstInstance = new Balance(100);
		}
		return firstInstance;
	}
	public void withdraw(int amount) {
	  if(balance > amount)
	  	balance -= amount;
	  else
	        System.out.println("Insufficient balance");
	}
	public void deposit(int amount){
		balance += amount;
	}
	public int getBalance(){
		return balance;
	}
}
