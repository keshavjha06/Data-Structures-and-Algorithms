package strings;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s1 = "LISTEN";
        String s2 = "SILENT";

        if(s1.length() != s2.length()) {
            System.out.println("Not Anagram");
            return;
        }

        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        if(Arrays.equals(c1 , c2)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
    }
    
}
