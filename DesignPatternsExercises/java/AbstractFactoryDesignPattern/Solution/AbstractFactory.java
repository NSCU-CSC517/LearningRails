// __________(1)__________ AbstractFactory {
interface AbstractFactory {
    // PhoneNumber __________(2)__________(Country country, String phoneNumber);
    PhoneNumber getPhoneNumberInstance(Country country, String phoneNumber);
    // PostCode __________(3)__________(Country country, String postalCode);
    PostCode getPostCodeInstance(Country country, String postalCode);
}
