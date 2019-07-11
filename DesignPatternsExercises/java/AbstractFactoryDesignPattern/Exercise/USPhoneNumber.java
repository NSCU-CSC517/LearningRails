public class USPhoneNumber implements PhoneNumber {
    private String phoneNumber;

    public USPhoneNumber(String phoneNumber) {
        if (!isValidPhoneNumber(phoneNumber))
            throw new IllegalArgumentException("Invalid US phone number");
        this.phoneNumber = phoneNumber;
        System.out.println("Instantiating USPhoneNumber with " + phoneNumber);
    }

    @Override
    public boolean isValidPhoneNumber(String phoneNumber) {
        return phoneNumber.matches("^(\\([0-9]{3}\\) |[0-9]{3}-)[0-9]{3}-[0-9]{4}$");
    }

    @Override
    public String getPhoneNumber() {
        return phoneNumber;
    }
}
