public class GeneralReport implements __________(3)__________ {
    private int customersNumber;
    private int ordersNumber;

    @Override
    public void __________(4)__________(Customer customer) {
        System.out.println("Customer: " + customer.getName());
        customersNumber++;
    }

    @Override
    public void __________(5)__________(Order order) {
        System.out.println("    " + order.getName());
        System.out.println("    Items:");
        for (String item : order.getItems())
            System.out.println("        " + item);
        ordersNumber++;
    }

    public void displayResults() {
        System.out.println("Number of customers: " + customersNumber);
        System.out.println("Number of orders:    " + ordersNumber);
    }
}
