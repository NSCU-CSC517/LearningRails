import java.util.ArrayList;

public class CityList {
	ArrayList<__________(1)__________> cities = new ArrayList<__________(2)__________>();

	public void addCity(City c) {
		__________(3)__________.add(c);
	}

	public ArrayList<City> getCities(){
		return cities;
	}

	public int getTotalPopulation() {
		int total_population = 0;
		for (City c : cities)
			total_population += c.population;
		return total_population;
	}
}
