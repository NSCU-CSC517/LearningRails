import java.util.HashMap;
import java.util.Map;

public class FlightFactory {
    private static final Map<String, Flight> flightMap = new HashMap<>();

    public Flight getFlight(String flightKey) {
        Flight flight = __________(2)__________.get(flightKey);
        if (flight == null) {
            flight = __________(3)__________(flightKey);
            flightMap.put(flightKey, flight);
        }
        return flight;
    }
}
