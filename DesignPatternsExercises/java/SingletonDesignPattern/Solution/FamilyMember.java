class FamilyMember {
    // __________(4)__________ balance;
    Balance balance;
    String name;

    public FamilyMember(String name) {
        this.name = name;
        // this.balance = __________(5)__________;
        this.balance = Balance.getInstance();
    }

    public void withdraw(int amount) {
        // __________(6)__________.withdraw(amount);
        balance.withdraw(amount);
    }

    public void deposit(int amount) {
        // __________(7)__________.deposit(amount);
        balance.deposit(amount);
    }

    public int getBalance() {
        // return __________(8)__________.getBalance();
        return balance.getBalance();
    }
}
