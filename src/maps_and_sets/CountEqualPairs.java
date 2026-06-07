package maps_and_sets;

import java.util.HashMap;

public class CountEqualPairs {

    public static void main(String[] args) {
        String s = "ananya"; // a * 3 + n * 2 + y * 1 = 9 + 4 + 1 = 14
        System.out.println(equalPairs(s));
    }

    static long equalPairs(String s){
        HashMap<Character , Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put( ch , map.getOrDefault(ch , 0) + 1);   
        }
        long pairs = 0;
        for(char ch : map.keySet()){
            long freq = map.get(ch);
            pairs = pairs + freq * freq;
        }
        return pairs;

    }
    
}
