public class MediatorDesignPattern {
	public static void main(String[] args) {
		Mediator mediator = new Mediator();
		new Seller("eurSeller", mediator, "EUR", 100);
		new Seller("gbpSeller1", mediator, "GBP", 50);
		new Seller("gbpSeller2", mediator, "GBP", 100);
		new Seller("inrSeller1", mediator, "INR", 100);
		new Seller("inrSeller2", mediator, "INR", 200);

		Buyer gbpBuyer = new Buyer(mediator, "GBP");
		gbpBuyer.attemptToPurchase(79);
		System.out.println();
		gbpBuyer.attemptToPurchase(79);
		System.out.println();
		Buyer inrBuyer = new Buyer(mediator, "INR");
		inrBuyer.attemptToPurchase(20000);
		System.out.println();
		Buyer rusBuyer = new Buyer(mediator, "RUS");
		rusBuyer.attemptToPurchase(1);
	}
}
