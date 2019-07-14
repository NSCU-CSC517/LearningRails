// __________(11)__________ {
interface Visitor {
    // void __________(12)__________(Customer customer);
    void visit(Customer customer);
    // void __________(13)__________(Order order);
    void visit(Order order);
}
