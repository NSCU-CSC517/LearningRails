// public __________(4)__________ class __________(5)__________ {
public abstract class Travel {
    protected String startDate, endDate, destination, meal, vehicle;
    protected boolean booked = false;

    // __________(6)__________ void __________(7)__________() {
    final void templateTravel() {
        System.out.println("Template travel information:");
        setDates();
        setDestination();
        if (!usePublicTransport())
            usePrivateVehicle();
        if (isMealAvailable())
            setMeal();
        if (usePublicTransport())
            bookTicket();
        displayTravelDetails();
    }

    abstract void setDates();

    abstract void setDestination();

    abstract void setMeal();

    abstract void usePrivateVehicle();

    abstract void bookTicket();

    // void __________(8)__________() {
    void displayTravelDetails() {
        System.out.println(" Travel has been confirmed.");
        System.out.println("    Start Date: " + startDate);
        System.out.println("    End Date: " + endDate);
        System.out.println("    Destination: " + destination);
    }

    boolean usePublicTransport() {
        return true;
    }

    // boolean __________(9)__________() {
    boolean isMealAvailable() {
        return false;
    }
}
