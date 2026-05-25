package if_else;

import java.util.Scanner;

public class TernaryInVariable {
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sb.nextInt();

        int Keshav = (n >= 0) ? 100 : 0;

        System.out.println(Keshav);
    }
}
