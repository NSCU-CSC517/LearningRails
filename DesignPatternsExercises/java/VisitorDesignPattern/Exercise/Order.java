import java.util.ArrayList;

public class Order implements Visitable {
    private String name;
    private ArrayList<String> items = new ArrayList<>();

    public Order(String name) {
        this.name = name;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(__________(6)__________);
    }

    public void addItem(String item) {
        items.add(item);
    }

    public String getName() {
        return name;
    }

    public ArrayList<String> getItems() {
        return items;
    }
}
