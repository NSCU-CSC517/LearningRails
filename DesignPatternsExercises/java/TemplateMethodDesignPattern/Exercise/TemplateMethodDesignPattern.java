public class TemplateMethodDesignPattern {
    public static void main(String[] args) {
        Travel travel = new AirTravel();
        travel.templateTravel();

        travel = new BusTravel();
        travel.templateTravel();

        travel = new CarTravel();
        travel.templateTravel();
    }
}
