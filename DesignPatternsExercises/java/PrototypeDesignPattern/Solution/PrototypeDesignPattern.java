public class PrototypeDesignPattern {
    public static void main(String[] args) {
        try {
            Car baseCar = new Car("Toyota");
        	// Car clonedCar  = __________(1)__________ PrototypeFactory.getInstance(baseCar);
            Car clonedCar  = (Car) PrototypeFactory.getInstance(baseCar);
            clonedCar.setModel("Honda");

            System.out.println();
            baseCar.printDetails();
            System.out.println();
            clonedCar.printDetails();
        } catch (CloneNotSupportedException e) {
        	System.out.println("Object not cloneable");
            e.printStackTrace();
        }
    }
}
