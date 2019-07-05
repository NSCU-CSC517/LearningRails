public interface Visitor {
    void visit(Customer customer);
    void visit(Order order);
}
