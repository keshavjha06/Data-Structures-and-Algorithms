package strings;

import java.util.Arrays;

public class NonRepeatingCharacter {
    public static void main(String[] args) {
        System.out.println(nonRepeatingCharacter("racecar"));
    }

    static char nonRepeatingCharacter(String s) {
        int[] freq = new int[256]; // supports all ASCII characters
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i)] == 1) {
                return s.charAt(i);
            }
        }
        return '$'; // Return '$' if there is no non-repeating character
    }
}
