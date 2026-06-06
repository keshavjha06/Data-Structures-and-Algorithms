package maps_and_sets;

import java.util.HashMap;

public class Anagram {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";
        System.out.println(isAnagram(s1, s2));
    }

    public static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            if (map1.containsKey(ch)) {
                int freq = map1.get(ch);
                map1.put(ch, freq + 1);
            } else
                map1.put(ch, 1);
        }
        for (int i = 0; i < s2.length(); i++) {
            char ch = s2.charAt(i);
            if (map2.containsKey(ch)) {
                int freq = map2.get(ch);
                map2.put(ch, freq + 1);
            } else
                map2.put(ch, 1);
        }
        return map1.equals(map2);
    }
}
