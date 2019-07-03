public class PrototypeFactory {
    // public static PrototypeCloneable __________(5)__________(PrototypeCloneable cloneableObject) throws CloneNotSupportedException {
    public static PrototypeCloneable getInstance(PrototypeCloneable cloneableObject) throws CloneNotSupportedException {
        // return cloneableObject.__________(6)__________();
        return cloneableObject.clone();
    }
}
