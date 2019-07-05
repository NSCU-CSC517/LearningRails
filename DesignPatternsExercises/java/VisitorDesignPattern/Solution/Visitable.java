public interface Visitable {
    // void __________(7)__________(Visitor visitor);
    void accept(Visitor visitor);
}
