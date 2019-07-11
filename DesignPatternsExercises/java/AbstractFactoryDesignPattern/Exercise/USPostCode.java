public class USPostCode implements PostCode {
    private String postalCode;

    public USPostCode(String postalCode) {
        if (!isValidPostalCode(postalCode))
            throw new IllegalArgumentException("Invalid postcode");
        this.postalCode = postalCode;
        System.out.println("Instantiating USPostCode with " + postalCode);
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
