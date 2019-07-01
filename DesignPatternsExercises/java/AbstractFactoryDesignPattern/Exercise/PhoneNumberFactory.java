public class PhoneNumberFactory implements AbstractFactory {

	@Override
	public PhoneNumber getPhoneNumberInstance(Country country, String phoneNumber) {
		if (country == Country.US)
			return new __________(11)__________(phoneNumber);
		if (country == Country.UK)
			return new __________(12)__________(phoneNumber);
		return null;
	}

	@Override
	public PostCode getPostCodeInstance(Country country, String postalCode) {
		throw new UnsupportedOperationException("Unable to get PostCodeInstance in the PhoneNumberFactory");
	}
}
