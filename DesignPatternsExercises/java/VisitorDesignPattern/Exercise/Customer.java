import java.util.ArrayList;

public class Customer implements Visitable {
    private String name;
    private ArrayList<__________(1)__________> orders = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.__________(2)__________;
        System.out.println("Orders:");
        for (Order order : orders)
            order.__________(3)__________;
        System.out.println();
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public String getName() {
        return name;
    }
}
