import java.util.Arrays;
import java.util.Iterator;

// public class CountryArray __________(3)__________ CountryIterable {
public class CountryArray implements CountryIterable {
    private Country[] countryArray = new Country[3];

    public CountryArray() {
        countryArray[0] = new Country("Australia", 100, 1000);
        countryArray[1] = new Country("China", 200, 2000);
        countryArray[2] = new Country("England", 300, 3000);
    }

    @Override
    public Iterator getIterator() {
        // return __________(4)__________.asList(countryArray).iterator();
        return Arrays.asList(countryArray).iterator();
    }
}
