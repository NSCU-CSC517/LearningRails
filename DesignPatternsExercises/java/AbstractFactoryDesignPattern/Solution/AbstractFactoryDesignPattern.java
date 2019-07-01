public class AbstractFactoryDesignPattern {
	public static void main(String[] args) {
		// AbstractFactory phoneNumberFactory = PostPhoneFactory.__________(1)__________(Type.PHONE);
		AbstractFactory phoneNumberFactory = PostPhoneFactory.getFactory(Type.PHONE);
		// PhoneNumber phoneNumberUK = phoneNumberFactory.__________(2)__________(Country.UK, "+44 7836 191 191");
		PhoneNumber phoneNumberUK = phoneNumberFactory.getPhoneNumberInstance(Country.UK, "+44 7836 191 191");
		// PhoneNumber phoneNumberUS = phoneNumberFactory.__________(3)__________(Country.US, "(919) 515-2011");
		PhoneNumber phoneNumberUS = phoneNumberFactory.getPhoneNumberInstance(Country.US, "(919) 515-2011");
		System.out.println(phoneNumberUK.getPhoneNumber());
		System.out.println(phoneNumberUS.getPhoneNumber());

		// AbstractFactory postCodeFactory = PostPhoneFactory.__________(4)__________(Type.POST);
		AbstractFactory postCodeFactory = PostPhoneFactory.getFactory(Type.POST);
		// PostCode postCodeUK = postCodeFactory.__________(5)__________(Country.UK, "SW15 5PU");
		PostCode postCodeUK = postCodeFactory.getPostCodeInstance(Country.UK, "SW15 5PU");
		// PostCode postCodeUS = postCodeFactory.__________(6)__________(Country.US, "27606");
		PostCode postCodeUS = postCodeFactory.getPostCodeInstance(Country.US, "27606");
		System.out.println(postCodeUK.getPostalCode());
		System.out.println(postCodeUS.getPostalCode());
	}
}
