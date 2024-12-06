package LeetcodeReview;

import java.util.HashMap;

public class HashTable {
    public static void main(String[] args) {
        String[] hasTable = new String[4];
        HashMap<Integer, String> map = new HashMap<>();


        // Add element
        map.put(1, "hanmeimei");
        map.put(2, "lihua");
        map.put(3, "siyangyuan");

        // Update element
        map.put(1, "bishi");

        map.remove(1);

        map.get(3);

        map.containsKey(3);
        map.containsValue("lihua");

        map.size();

        map.isEmpty();

        System.out.println(map.toString());


    }
}
