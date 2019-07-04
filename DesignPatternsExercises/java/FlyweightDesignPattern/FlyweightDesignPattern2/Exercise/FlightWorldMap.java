import java.util.Random;

public class FlightWorldMap {
    private final String[] flights = { "Air France", "American Airlines", "BA", "Delta", "KLM", "United Airlines" };
    private Random random = new Random();
    private FlightFactory flightFactory = new FlightFactory();

    public void displayAllFlights() {
        for (int i = 0; i < 10; i++) {
            Flight flight = flightFactory.__________(4)__________(getRandomFlight());
            flight.drawOnMap(getRandomFlightNumber(), getRandomLatitude(), getRandomLongitude());
        }
    }

    private double getRandomLatitude() {
        double value = Math.random() * 90;
        return random.nextBoolean() ? value : value * -1D;
    }

    private double getRandomLongitude() {
        double value = Math.random() * 180;
        return random.nextBoolean() ? value : value * -1D;
    }

    private String getRandomFlight() {
        return flights[random.nextInt(5)];
    }

    private int getRandomFlightNumber() {
        return random.nextInt(999);
    }
}
