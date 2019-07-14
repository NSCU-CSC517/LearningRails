public class CarTravel extends Travel {
    @Override
    public void setDates() {
        System.out.println("Setting dates...");
        this.startDate = "01/01/2020";
        this.endDate = "01/10/2020";
    }

    @Override
    public void setDestination() {
        System.out.println("Setting destination...");
        this.destination = "Miami, FL, USA";
    }

    @Override
    void setMeal() {
    }

    @Override
    void usePrivateVehicle() {
        System.out.println("Selecting vehicle...");
        this.vehicle = "Honda Freed";
    }

    @Override
    void bookTicket() {
    }

    @Override
    void displayTravelDetails() {
        System.out.print("Car Travel:");
        __________(3)__________.displayTravelDetails();
        if (vehicle != null)
            System.out.println("    Vehicle selected: " + vehicle);
    }

    @Override
    boolean usePublicTransport() {
        return false;
    }
}
