public class Map {
	String map_name;
	int height;
	int width;
	// __________(5)__________ cities;
	CityList cities;

	// public Map(String name, int h, int w, __________(6)__________  cities) {
	public Map(String name, int h, int w, CityList cities) {
		this.map_name = name;
		this.height = h;
		this.width = w;
		this.cities = cities;
	}

	public void displayMap() {
		System.out.println("Drawing " + map_name + " with dimensions " + height + " x " + width);
		for (City c : cities.getCities())
			System.out.print(c.name + " --> ");
	}
}
