import java.util.*;

public class SortedMapDemo {

    public static void main(String args[]) {
        // Create a hash map
        AbstractMap<String, Double> map = new TreeMap<>();
        Set<Integer> sett = Set.of(1,2,3,4,5);
        System.out.println(sett.contains(2));

        // Put elements to the map
        map.put("Zara", Double.valueOf(3434.34));
        map.put("Mahnaz", Double.valueOf(123.22));
        map.put("Ayan", Double.valueOf(1378.00));
        map.put("Daisy", Double.valueOf(99.22));
        map.put("Qadir", Double.valueOf(-19.08));

        // Get a set of the entries
        Set<Map.Entry<String, Double>> set = map.entrySet();

        // Get an iterator
        Iterator<Map.Entry<String, Double>> i = set.iterator();

        // Display elements
        while(i.hasNext()) {
            Map.Entry<String, Double> me = i.next();
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
    }
}