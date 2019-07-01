public abstract class PostPhoneFactory {
	public static AbstractFactory getFactory(Type type) {
		if (type == Type.PHONE)
			return new __________(7)__________();
		if (type == Type.POST)
			return new __________(8)__________();
		return null;
	}
}
