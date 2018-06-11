package singleresponsibility.bad;

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
	
	public void displayCities() {
		System.out.println("Drawing cities on screen...");
	}
	
	public int getTotalPopulation() {
		int total_population = 0;
		for ( City c : cities)
			total_population += c.population;
		return total_population;
	}
	
	
	
	
}
