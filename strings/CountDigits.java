package strings;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        // String s = "" + n;
        // String s = Integer.toString(n);
        String s = String.valueOf(n);
        System.out.println(s.length());
        String str = "768923";
        // int number = Integer.parseInt(str);
        int number = Integer.valueOf(str);
        System.out.println(number);
    }
}
