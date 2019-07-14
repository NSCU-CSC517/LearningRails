class Balance {
    // __________(1)__________ Balance firstInstance = null;
    private static Balance firstInstance = null;
    private int balance;

    // __________(2)__________ {
    private Balance(int balance) {
        this.balance = balance;
    }

    public static Balance getInstance() {
        // if(__________(3)__________) {
        if (firstInstance == null) {
            firstInstance = new Balance(100);
        }
        return firstInstance;
    }

    public void withdraw(int amount) {
        if (balance > amount)
            balance -= amount;
        else
            System.out.println("Insufficient balance");
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public int getBalance() {
        return balance;
    }
}
