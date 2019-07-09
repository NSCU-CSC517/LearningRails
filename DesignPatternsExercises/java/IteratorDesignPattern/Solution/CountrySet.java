import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// public class CountrySet __________(9)__________ CountryIterable {
public class CountrySet implements CountryIterable {
    Set<Country> countrySet = new HashSet<>();

    public CountrySet() {
        countrySet.add(new Country("Japan", 700, 7000));
        countrySet.add(new Country("Russia", 800, 8000));
        countrySet.add(new Country("United States", 900, 9000));
    }

    @Override
    public Iterator getIterator() {
        // return __________(10)__________.iterator();
        return countrySet.iterator();
    }
}
