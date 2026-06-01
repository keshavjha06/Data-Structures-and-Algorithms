package strings;

public class Palindrome {
    public static void main(String[] args) {
        String str = "abcdcba";
        System.out.println(isPalindrome(str));

    }

    static boolean isPalindrome(String str) {
        if (str == null || str.length() == 0)
            return true;
        str = str.toLowerCase();
        int i = 0, j = str.length() - 1;
        while (i <= j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

}
