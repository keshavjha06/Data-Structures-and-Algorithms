package strings;

public class FirstUniqueCharacter {
    public static void main(String[] args) {
        System.out.println(firstUniqChar("racecar"));
    }

    public static int firstUniqChar(String s) {
        int[] freq = new int[256]; // supports all ASCII characters
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i)] == 1) {
                return i;
            }
        }
        return -1;
    }
}
