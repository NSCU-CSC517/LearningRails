public class VisitorDesignPattern {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Customer1");
        Order order1 = new Order("Order1");
        order1.addItem("Item1");
        order1.addItem("Item2");
        customer1.addOrder(order1);
        Order order2 = new Order("Order2");
        order2.addItem("Item3");
        order2.addItem("Item4");
        customer1.addOrder(order2);

        Customer customer2 = new Customer("Customer2");
        Order order3 = new Order("Order3");
        order3.addItem("Item5");
        order3.addItem("Item6");
        customer2.addOrder(order3);

        GeneralReport visitor = new GeneralReport();
        customer1.accept(visitor);
        customer2.accept(visitor);

        visitor.displayResults();
    }
}
