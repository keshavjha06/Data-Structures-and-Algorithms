package collections;

import java.util.HashMap;
import java.util.Map;

// No duplicate keys, but different keys can map to same value
//  HashMap allows one null key and multiple null values , but Hashtable does not allow null keys or values

public class HashMapMethods {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("India", "New Delhi");
        map.put("France", "Paris");
        map.put("Japan", "Tokyo");
        System.out.println(map);
        System.out.println(map.get("India"));
        System.out.println(map.containsKey("India"));
        System.out.println(map.containsValue("New Delhi"));
        System.out.println(map.size());
        System.out.println(map.remove("India")); // New Delhi
        System.out.println(map.keySet()); // [Japan, France]
        System.out.println(map.values()); // [Tokyo, Paris]
        System.out.println(map.entrySet()); // [Japan=Tokyo, France=Paris]
        System.out.println(map.getOrDefault("France", "NONE")); // Paris
        System.out.println(map.replace("France", "New York")); // {Japan=Tokyo, France=New York}
        System.out.println(map);
        map.clear();
        System.out.println(map);
        System.out.println(map.isEmpty());

        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1, "One");
        map1.put(2, "Two");

        for (Map.Entry<Integer, String> entry : map1.entrySet()) {
            System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());

        }

    }

}
