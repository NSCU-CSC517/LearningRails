public class SingleResponsibilityPrincipleGood {
    public static void main(String[] args) {
        City c1 = new City("Raleigh");
        City c2 = new City("Durham");

        CityList ct = new CityList();
        ct.addCity(c1);
        ct.addCity(c2);

        Map map = new Map("Triangle Map", 10, 10, ct);
        map.displayMap();
    }
}
