public class PostCodeFactory implements AbstractFactory {

	@Override
	public PostCode getPostCodeInstance(Country country, String postalCode) {
		if (country == Country.US)
			// return new __________(13)__________(postalCode);
			return new USPostCode(postalCode);
		if (country == Country.UK)
			// return new __________(14)__________(postalCode);
			return new UKPostCode(postalCode);
		return null;
	}

	@Override
	public PhoneNumber getPhoneNumberInstance(Country country, String phoneNumber) {
		throw new UnsupportedOperationException("Unable to get PhoneNumberInstance in the PostCodeFactory");
	}
}
