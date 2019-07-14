import java.util.ArrayList;

public class Order implements Visitable {
    private String name;
    private ArrayList<String> items = new ArrayList<>();

    public Order(String name) {
        this.name = name;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.__________(7)__________;
    }

    public void addItem(String item) {
        items.add(item);
    }

    public String getName() {
        return name;
    }

    public ArrayList<String> __________(8)__________() {
        return items;
    }
}
