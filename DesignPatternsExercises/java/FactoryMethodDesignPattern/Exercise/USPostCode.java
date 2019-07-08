public class USPostCode implements PostCode {
    private String postalCode;

    public USPostCode(String postalCode) {
        if (!__________(8)__________(postalCode)) {
            throw new IllegalArgumentException("Invalid postcode");
        }
        this.postalCode = postalCode;
        System.out.println("Creating instance of USPostCode:");
    }

    @Override
    public boolean isValidPostalCode(String postalCode) { //> 6
        return postalCode.matches("^[0-9]{5}(?:-[0-9]{4})?$");
    }

    @Override
    public String getPostalCode() {
        return postalCode;
    }
}
