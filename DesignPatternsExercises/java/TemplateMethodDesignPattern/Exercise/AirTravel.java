public class AirTravel extends Travel {
    @Override
    public void setDates() {
        System.out.println("Setting dates...");
        this.startDate = "07/04/2019";
        this.endDate = "08/10/2019";
    }

    @Override
    public void setDestination() {
        System.out.println("Setting destination...");
        this.destination = "Tokyo, Japan";
    }

    @Override
    void setMeal() {
        System.out.println("Selecting meal...");
        this.meal = "Asian Vegetarian";
    }

    @Override
    void usePrivateVehicle() {}

    @Override
    void bookTicket() {
        System.out.println("Booking ticket...");
        booked = true;
    }

    @Override
    void displayTravelDetails() {
        System.out.println("Air Travel:");
        if (booked) {
            __________(1)__________.displayTravelDetails();
            if (meal != null) {
                System.out.println("        Meal selected: " + meal);
            }
        } else {
            System.out.println("    Transaction cancelled");
        }
        System.out.println();
    }

    @Override
    boolean isMealAvailable() {
        return true;
    }
}
