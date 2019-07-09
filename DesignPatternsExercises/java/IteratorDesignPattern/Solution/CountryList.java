import java.util.ArrayList;
import java.util.Iterator;

// public class CountryList __________(7)__________ CountryIterable {
public class CountryList implements CountryIterable {
    private ArrayList<Country> countryList = new ArrayList<>();

    public CountryList() {
        countryList.add(new Country("France", 400, 4000));
        countryList.add(new Country("Germany", 500, 5000));
        countryList.add(new Country("India", 600, 6000));
    }

    @Override
    public Iterator getIterator() {
        // return __________(8)__________.iterator();
        return countryList.iterator();
    }
}
