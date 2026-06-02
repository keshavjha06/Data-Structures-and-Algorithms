package strings;

public class ReverseEachWord {
    public static void main(String[] args) {
        String s = " Archit   is   a good  boy ";
        System.out.println("Original: '" + s + "'");
        s = reverseWords(s);
        System.out.println("Reversed: '" + s + "'");
    }

    public static String reverseWords(String s) {
        // split by one or more spaces, and trim leading/trailing spaces
        String[] words = s.trim().split("\\s+");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            StringBuilder word = new StringBuilder(words[i]);
            result.append(word.reverse());
            if (i < words.length - 1) {
                result.append(" ");
            }
        }
        return result.toString();
    }
}