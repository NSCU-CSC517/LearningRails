public class PostCodeFactory implements AbstractFactory {
    @Override
    public PostCode getPostCodeInstance(Country country, String postalCode) {
        if (country == Country.US)
            return __________(12)__________(postalCode);
        if (country == Country.UK)
            return __________(13)__________(postalCode);
        return null;
    }

    @Override
    public PhoneNumber getPhoneNumberInstance(Country country, String phoneNumber) {
        throw new UnsupportedOperationException("Unable to get PhoneNumberInstance in the PostCodeFactory");
    }
}
