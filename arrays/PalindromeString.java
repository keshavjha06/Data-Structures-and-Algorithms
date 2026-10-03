package arrays;

public class PalindromeString {

    public static boolean isPalindrome(String word) {
        if(word == null) {
            throw new IllegalArgumentException("Input string cannot be null");
        }

        if(word.isEmpty()) {
            return true;
        }

        char[] charArray  = word.toCharArray();
        int start = 0;
        int end = word.length()-1;
        while(start < end) {
            if(charArray[start] != charArray[end])
                return false;
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.print(isPalindrome("madam"));
        /*PalindromeString palindromeString = new PalindromeString();
        if (palindromeString.isPalindrome("madam"))
            System.out.println("String is palindrome");
        else
            System.out.println("String is not palindrome");*/
    }
}
