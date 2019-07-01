public class USPostCode implements PostCode {
	// private String __________(25)__________;
    private String postalCode;

	public USPostCode(String postalCode) {
		// if(!__________(26)__________(postalCode))
    	if(!isValidPostalCode(postalCode))
    		throw new IllegalArgumentException("Invalid postcode");
    	this.postalCode = postalCode;
    }
	@Override
	public boolean isValidPostalCode(String postalCode) {
		return postalCode.matches("^[0-9]{5}(?:-[0-9]{4})?$");
	}
	@Override
	public String getPostalCode() {
		return postalCode;
	}
}
