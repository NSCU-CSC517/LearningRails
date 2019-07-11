public abstract class PostPhoneFactory {
    // public __________(14)__________ AbstractFactory __________(15)__________(Type type) {
    public static AbstractFactory getFactory(Type type) {
        if (type == Type.PHONE)
            // return __________(16)__________();
            return new PhoneNumberFactory();
        if (type == Type.POST)
            // return __________(17)__________();
            return new PostCodeFactory();
        return null;
    }
}
