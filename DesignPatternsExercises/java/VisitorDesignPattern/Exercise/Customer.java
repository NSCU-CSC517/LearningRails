import java.util.ArrayList;

public class Customer implements Visitable {
    private String name;
    private ArrayList<Order> orders = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(__________(1)__________);
        System.out.println("Orders:");
        for (Order order : orders)
            order.__________(2)__________(visitor);
        System.out.println();
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public String getName() {
        return name;
    }
}
