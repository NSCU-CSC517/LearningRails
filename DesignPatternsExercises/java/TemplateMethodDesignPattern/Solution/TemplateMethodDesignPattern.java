public class TemplateMethodDesignPattern {
    public static void main(String[] args) {
        Travel travel = new AirTravel();
        travel.setTravel();

        travel = new BusTravel();
        travel.setTravel();

        travel = new RoadTrip();
        travel.setTravel();
    }
}
