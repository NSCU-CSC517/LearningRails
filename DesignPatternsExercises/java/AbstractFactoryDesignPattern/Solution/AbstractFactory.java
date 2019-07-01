public interface AbstractFactory {
	// PhoneNumber __________(9)__________(Country country, String phoneNumber);
	PhoneNumber getPhoneNumberInstance(Country country, String phoneNumber);
	// PostCode __________(10)__________(Country country, String postalCode);
	PostCode getPostCodeInstance(Country country, String postalCode);
}
