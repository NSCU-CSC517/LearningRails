package singleresponsibility.good.incomplete;

public class Map {
	String map_name;
	int height;
	int width;
	___ cities; //4
	
	public Map(String name, int h, int w, ___ cities) { //5
		this.map_name = name;
		this.height = h;
		this.width = w;
		this.cities = cities;
	}

	public void displayCities() {
		System.out.println("Drawing " + map_name + " with dimensions " + height + " x " + width);
	}
	
}
