import java.util.ArrayList;
import java.util.Iterator;

public class CountryList implements CountryIterable {
	private ArrayList<Country> countryList = new ArrayList<>();

	public CountryList() {
		countryList.add(new Country("Russia",660,143));
		countryList.add(new Country("Japan",14,127));
		countryList.add(new Country("England",5,53));
	}

	@Override
	public Iterator getIterator() {
		// return __________(6)__________.iterator();
		return countryList.iterator();
	}
}
