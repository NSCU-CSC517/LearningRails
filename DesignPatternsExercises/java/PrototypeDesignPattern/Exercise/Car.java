public class Car implements __________(2)__________ {
    private String model;
    private int seats = 4;
    private int engineVolume = 2000;
    private int horsePower = 150;

    public Car(String model) {
        this.model = model;
        System.out.println("Creating Car object...");
    }

    @Override
    public Car clone() throws CloneNotSupportedException {
        System.out.println("Cloning Car object...");
        return (Car) __________(3)__________();
    }

    public void printDetails() {
        System.out.println("Model: " + model + "\nNumber of Seats: " + seats + "\nEngine Volume: " + engineVolume +
                " cm^3\nHorse Power: " + horsePower);
    }

    public void setModel(String model) {
        this.model = model;
    }
}
