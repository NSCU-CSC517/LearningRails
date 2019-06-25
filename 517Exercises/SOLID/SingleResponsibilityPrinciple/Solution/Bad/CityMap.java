import java.util.ArrayList;

public class CityMap {
	ArrayList<City> cities = new ArrayList<City>();
	String map_name;
	int height;
	int width;

	public CityMap(String name, int h, int w) {
		this.map_name = name;
		this.height = h;
		this.width = w;
	}

	public void addCity(City c) {
		cities.add(c);
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

	public void displayMap() {
		System.out.println("Drawing " + map_name + " with dimensions " + height + " x " + width);
		for (City c : cities)
			System.out.print(c.name + " --> ");
	}
}
