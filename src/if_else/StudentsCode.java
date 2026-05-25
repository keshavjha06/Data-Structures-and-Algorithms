package if_else;

import java.util.Scanner;

public class StudentsCode {
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int a = sb.nextInt();
        if (a % 5 == 0 && a % 3 == 0)
            System.out.println("John");
        else if (a % 3 == 0)
            System.out.println("Mary");
        else if (a % 5 == 0)
            System.out.println("Michael");
        else
            System.out.println("Keshav");
    }
}
