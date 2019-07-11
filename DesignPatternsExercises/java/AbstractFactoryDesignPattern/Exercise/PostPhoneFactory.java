public abstract class PostPhoneFactory {
    public __________(14)__________ AbstractFactory __________(15)__________(Type type) {
        if (type == Type.PHONE)
            return __________(16)__________();
        if (type == Type.POST)
            return __________(17)__________();
        return null;
    }
}
