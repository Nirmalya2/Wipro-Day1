import java.util.HashSet;

public class CityHashSetDemo {
    public static void main(String[] args) {
        // Create a HashSet of strings to store city names
        HashSet<String> citySet = new HashSet<>();

        // ## Adding City Names
        // Add five city names (with a duplicate)
        citySet.add("Mumbai");
        citySet.add("Delhi");
        citySet.add("Bangalore");
        citySet.add("Chennai");
        citySet.add("Mumbai");  // Duplicate entry

        // ## Display Set Elements
        System.out.println("Cities in the Set:");
        for (String city : citySet) {
            System.out.println(city);
        }

        // ## Check City Existence
        String searchCity = "Delhi";
        if (citySet.contains(searchCity)) {
            System.out.println("\n" + searchCity + " exists in the set.");
        } else {
            System.out.println("\n" + searchCity + " does not exist in the set.");
        }

        // ## Remove a City
        String removeCity = "Bangalore";
        citySet.remove(removeCity);

        // ## Display Updated Set
        System.out.println("\nUpdated Cities after removing " + removeCity + ":");
        for (String city : citySet) {
            System.out.println(city);
        }
    }
}