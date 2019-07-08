public class PostCodeFactory {
    public static PostCode getInstance(Country country, String postalCode) {
        if (country == Country.US)
            // return new __________(4)__________;
            return new USPostCode(postalCode);
        if (country == Country.UK)
            // return new __________(5)__________;
            return new UKPostCode(postalCode);
        if (country == Country.IN)
            // return new __________(6)__________;
            return new INPostCode(postalCode);

        return null;
    }
}
