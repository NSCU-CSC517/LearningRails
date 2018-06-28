package singleresponsibility.good.complete;

public class CityMap {
	String map_name;
	int height;
	int width;
	CityList cities;
	
	public CityMap(String name, int h, int w, CityList cities) {
		this.map_name = name;
		this.height = h;
		this.width = w;
		this.cities = cities;
	}

	public void displayCities() {
		System.out.println("Drawing " + map_name + " with dimensions " + height + " x " + width);
	}
	
}
