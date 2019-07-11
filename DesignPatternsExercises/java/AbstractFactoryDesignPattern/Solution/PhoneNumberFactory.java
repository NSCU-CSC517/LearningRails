public class PhoneNumberFactory implements AbstractFactory {
    @Override
    public PhoneNumber getPhoneNumberInstance(Country country, String phoneNumber) {
        if (country == Country.US)
            // return __________(7)__________(phoneNumber);
            return new USPhoneNumber(phoneNumber);
        if (country == Country.UK)
            // return __________(8)__________(phoneNumber);
            return new UKPhoneNumber(phoneNumber);
        return null;
    }

    @Override
    public PostCode getPostCodeInstance(Country country, String postalCode) {
        throw new UnsupportedOperationException("Unable to get PostCodeInstance in the PhoneNumberFactory");
    }
}
