public class PostCodeFactory {
	enum Country {
		US, UK, IN
	}

	public static PostCode getInstance(Country country, String postalCode) {
		if(country == Country.US)
			return new __________(1)__________;
		if(country == Country.UK)
			return new __________(2)__________;
		if(country == Country.IN)
			return new __________(3)__________;

		return null;
	}
}
