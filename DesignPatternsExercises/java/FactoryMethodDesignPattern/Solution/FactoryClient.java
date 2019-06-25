public class FactoryClient {

	public static void main(String[] args) {
		PostCode postCode = PostCodeFactory.getInstance(PostCodeFactory.Country.US, "27606");
		System.out.println(postCode.getPostalCode());
		postCode = PostCodeFactory.getInstance(PostCodeFactory.Country.IN, "576222");
		System.out.println(postCode.getPostalCode());
		postCode = PostCodeFactory.getInstance(PostCodeFactory.Country.UK, "SW15 5PU");
		System.out.println(postCode.getPostalCode());
	}

}
