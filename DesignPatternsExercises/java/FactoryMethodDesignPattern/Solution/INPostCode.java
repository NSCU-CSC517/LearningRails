public class INPostCode implements PostCode {
    private String postalCode;

    public INPostCode(String postalCode) {
        // if (!__________(1)__________(postalCode)) {
        if (!isValidPostalCode(postalCode)) {
            throw new IllegalArgumentException("Invalid postcode");
        }
        this.postalCode = postalCode;
        System.out.println("Creating instance of INPostCode:");
    }

    @Override
    public boolean isValidPostalCode(String postalCode) {
        return postalCode.matches("[0-9]{6}");
    }

    @Override
    public String getPostalCode() {
        return postalCode;
    }
}
