public class SingleResponsibilityPrincipleBad {
    public static void main(String[] args) {
        City c1 = new City("Raleigh");
        City c2 = new City("Durham");

        CityMap ct = new CityMap("Triangle Map", 10, 10);
        ct.addCity(c1);
        ct.addCity(c2);
        ct.displayMap();
    }
}
