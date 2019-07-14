class FamilyMember {
    // __________(4)__________ balance;
    Balance balance;
    String name;

    public FamilyMember(String name) {
        this.name = name;
        // this.balance = __________(5)__________;
        this.balance = Balance.getInstance();
    }

    public void withdraw(int val) {
        // __________(6)__________.withdraw(val);
        balance.withdraw(val);
    }

    public void deposit(int val) {
        // __________(7)__________.deposit(val);
        balance.deposit(val);
    }

    public int getBalance() {
        // return __________(8)__________.getBalance();
        return balance.getBalance();
    }
}
