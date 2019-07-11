public class AbstractFactoryDesignPattern {
    public static void main(String[] args) {
        AbstractFactory phoneNumberFactory = PostPhoneFactory.getFactory(Type.PHONE);
        PhoneNumber phoneNumberUK = phoneNumberFactory.getPhoneNumberInstance(Country.UK, "+44 7836 191 191");
        PhoneNumber phoneNumberUS = phoneNumberFactory.getPhoneNumberInstance(Country.US, "(919) 515-2011");
        System.out.println(phoneNumberUK.getPhoneNumber());
        System.out.println(phoneNumberUS.getPhoneNumber());
        System.out.println();

        AbstractFactory postCodeFactory = PostPhoneFactory.getFactory(Type.POST);
        PostCode postCodeUK = postCodeFactory.getPostCodeInstance(Country.UK, "SW15 5PU");
        PostCode postCodeUS = postCodeFactory.getPostCodeInstance(Country.US, "27606");
        System.out.println(postCodeUK.getPostalCode());
        System.out.println(postCodeUS.getPostalCode());
    }
}
