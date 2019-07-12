public class PrototypeDesignPattern {
    public static void main(String[] args) {
        try {
            Car originalCar = new Car("Toyota");
            // Car clonedCar  = __________(1)__________ PrototypeFactory.getInstance(originalCar);
            Car clonedCar = (Car) PrototypeFactory.getInstance(originalCar);
            clonedCar.setModel("Honda");

            System.out.println("\nOriginal Car:");
            originalCar.printDetails();
            System.out.println("\nCloned Car:");
            clonedCar.printDetails();
        } catch (CloneNotSupportedException e) {
            System.out.println("Object not cloneable");
            e.printStackTrace();
        }
    }
}
