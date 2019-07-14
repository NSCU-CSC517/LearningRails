public class BusTravel extends Travel {
    @Override
    public void setDates() {
        System.out.println("Setting dates...");
        this.startDate = "09/05/2019";
        this.endDate = "10/01/2019";
    }

    @Override
    public void setDestination() {
        System.out.println("Setting destination...");
        this.destination = "New York, NY, USA";
    }

    @Override
    void setMeal() {
    }

    @Override
    void usePrivateVehicle() {
    }

    @Override
    void bookTicket() {
        System.out.println("Booking ticket...");
    }

    @Override
    void displayTravelDetails() {
        System.out.print("Bus Travel:");
        if (booked)
            __________(2)__________.displayTravelDetails();
        else
            System.out.println(" Transaction cancelled");
        System.out.println();
    }
}
