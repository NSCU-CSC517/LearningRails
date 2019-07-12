public class PrototypeFactory {
    // public __________(6)__________ PrototypeCloneable __________(7)__________(PrototypeCloneable cloneableObject) throws CloneNotSupportedException {
    public static PrototypeCloneable getInstance(PrototypeCloneable cloneableObject) throws CloneNotSupportedException {
        // return cloneableObject.__________(8)__________();
        return cloneableObject.clone();
    }
}
