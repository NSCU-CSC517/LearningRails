// public __________(4)__________ class __________(5)__________ {
public abstract class Travel {
    String startDate, endDate, destination, meal, vehicle;
    boolean booked = false;

    // __________(6)__________ void __________(7)__________() {
    final void setTravel() {
        System.out.println("Setting setTravel information:");
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
        System.out.println("    Travel has been confirmed. Here is details:");
        System.out.println("        Start Date: " + startDate);
        System.out.println("        End Date: " + endDate);
        System.out.println("        Destination: " + destination);
    }

    boolean isMealAvailable() {
        return false;
    }

    boolean usePublicTransport() {
        return true;
    }
}
