package if_else;

import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sb.nextInt();

        // if(n%2 == 0) System.out.println("Even");
        // else System.out.println("Odd");
        // condition ? true : false
        System.out.println((n % 2 == 0) ? "Even" : "Odd");

    }
}
