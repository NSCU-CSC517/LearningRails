public class DependencyInversionPrincipleBad {
    public static void main(String[] args) {
        Bank bank = new Bank();

        CheckingAccount checking = new CheckingAccount();
        checking.deposit(100);
        SavingsAccount saving = new SavingsAccount();

        System.out.println("Before transaction:");
        System.out.println("Checking account balance is $" + checking.getBalance());
        System.out.println("Saving account balance is $" + saving.getBalance());

        bank.processTransaction(checking, saving, 50);

        System.out.println("After transaction:");
        System.out.println("Checking account balance is $" + checking.getBalance());
        System.out.println("Saving account balance is $" + saving.getBalance());
    }
}
