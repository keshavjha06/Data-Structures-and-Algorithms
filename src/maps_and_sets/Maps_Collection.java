package maps_and_sets;

import java.util.HashMap;

public class Maps_Collection {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Keshav", 22); // add
        map.put("Anirudh", 21);
        map.put("Manas", 11);
        map.put("Ritik", 26);
        for (String key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }
        System.out.println(map + " " + map.size());
        map.remove("Manas");
        System.out.println(map + " " + map.size());
        System.out.println(map.get("Keshav"));
        map.put("Ritik", 23);
        System.out.println(map + " " + map.size());
        System.out.println(map.containsKey("Anirudh"));
    }

}
