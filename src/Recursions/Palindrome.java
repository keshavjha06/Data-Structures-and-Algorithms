package Recursions;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       String str = sc.nextLine().toLowerCase();
       System.out.println(isPalindrome(str));

    }

    static boolean isPalindrome(String s) {
        return palindromeHelper(0, s.length() - 1, s);
    }

    static boolean palindromeHelper(int l, int r, String s) {
        if (l >= r)
            return true;
        if (s.charAt(l) != s.charAt(r))
            return false;
        return palindromeHelper(l + 1, r - 1, s);
    }
}
