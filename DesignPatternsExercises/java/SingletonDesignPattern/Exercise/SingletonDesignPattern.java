public class SingletonDesignPattern {

	public static void main(String[] args) {
		FamilyMember father = new FamilyMember("Father");
		System.out.println("Current family balance: $" + father.getBalance());
		System.out.println("Father deposits $1000");
		father.deposit(1000);
		System.out.println("Balance after deposit: $" + father.getBalance());

		FamilyMember son = new FamilyMember("Son");
		System.out.println("Son withdraws $200");
		son.withdraw(200);
		System.out.println("Balance after withdrawal: $" + son.getBalance());

		System.out.println("Son withdraws $1000");
		son.withdraw(1000);
		System.out.println("Balance after withdrawal: $" + son.getBalance());
	}

}
