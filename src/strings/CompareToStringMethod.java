package strings;

public class CompareToStringMethod {
    public static void main(String[] args) {
        String a = "raghav"; // harmeet
        String b = "preet";  // harsh   m - s -> -6
        // System.out.println(a.compareTo(a)); // r - p i.e 2
        System.out.println(compareTo(a, b));
    }

    public static int compareTo(String a, String b) {
        int i = 0;
        int j = 0;
        int len1 = a.length();
        int len2 = b.length();
        while (i < len1 && j < len2) {
            if (a.charAt(i) != b.charAt(j)) {
                return a.charAt(i) - b.charAt(j);
            }
            i++;
            j++;
        }
        return len1 - len2;
    }

}
