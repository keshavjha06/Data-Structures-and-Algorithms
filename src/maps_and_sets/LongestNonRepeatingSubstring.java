package maps_and_sets;

import java.util.HashMap;

public class LongestNonRepeatingSubstring {
    // Longest Substring without repeating characters
    public static void main(String[] args) {
        String s = "geeksforgeeks"; // eksforg - 7
        System.out.println(longestUniqueSubstring(s));
    }

    static int longestUniqueSubstring(String s) {
        int i = 0, j = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int ans = 0;
        while (j < s.length()) {
            char ch = s.charAt(j);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            if (map.get(ch) > 1) {
                while (map.get(ch) > 1) {
                    char ch2 = s.charAt(i);
                    map.put(ch2, map.get(ch2) - 1);
                    i++;
                }
            }
            ans = Math.max(ans, j - i + 1);
            j++;
        }

        return ans;
    }

}
