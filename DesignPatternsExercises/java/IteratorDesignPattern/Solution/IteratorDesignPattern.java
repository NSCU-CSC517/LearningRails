import java.util.Iterator;

public class IteratorDesignPattern {
    public static void main(String[] args) {
        Iterator iterator;

        System.out.println("Array of Countries:");
        iterator = new CountryArray().getIterator();
        displayCountries(iterator);

        System.out.println("\nList of Countries:");
        iterator = new CountryList().getIterator();
        displayCountries(iterator);

        System.out.println("\nSet of Countries:");
        iterator = new CountrySet().getIterator();
        displayCountries(iterator);
        System.out.println();
    }

    // public static void __________(1)__________(Iterator iterator) {
    public static void displayCountries(Iterator iterator) {
        while (iterator.hasNext()) {
            // Country country = __________(2)__________ iterator.next();
            Country country = (Country) iterator.next();
            System.out.println("Country: " + country.getName() + " -- Area: " + country.getArea() +
                    " -- Population: " + country.getPopulation());
        }
    }
}
