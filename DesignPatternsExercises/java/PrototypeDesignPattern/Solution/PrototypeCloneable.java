// __________(4)__________ PrototypeCloneable extends Cloneable {
interface PrototypeCloneable extends Cloneable {
    // PrototypeCloneable __________(5)__________ throws CloneNotSupportedException;
    PrototypeCloneable clone() throws CloneNotSupportedException;
}
