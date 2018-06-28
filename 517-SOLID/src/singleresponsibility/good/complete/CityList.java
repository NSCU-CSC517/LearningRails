package singleresponsibility.good.complete;

import java.util.ArrayList;

public class CityList {
	ArrayList<City> cities = new ArrayList<City>();
	
	public CityList() {
	
	}
	
	public void addCity(City c) {
		cities.add(c);
	}
	
	public ArrayList<City> getCities(){
		return cities;
	}
	
	public int getTotalPopulation() {
		int total_population = 0;
		for ( City c : cities)
			total_population += c.population;
		return total_population;
	}
	
	
	
	
}
