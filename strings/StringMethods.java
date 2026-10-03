package strings;

import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        char[] arr = {'K', 'e', 's', 'h', 'a', 'v'};
        for (char ele : arr) {
            System.out.print(ele + " ");
        }
        String str = "Keshav";
        System.out.println(str);

        /* Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Full Name String");
        String y = sc.nextLine();
        System.out.println(y);
        System.out.println("Enter the First Name String");
        String t = sc.next();
        System.out.println(t);
 */
        String s = "Keshav Jha";
        System.out.println(s.indexOf('s'));
        System.out.println(s.lastIndexOf('a'));
        System.out.println(s.indexOf('t')); // -1 as its not there
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(s.trim()); // remove leading and trailing whitespaces
        System.out.println(s.contains("Kesh")); //true
        System.out.println(s.startsWith("Kesh")); //true
        System.out.println(s.endsWith("Kesh")); //false
        System.out.println(s.isEmpty()); //false
        System.out.println(s.length()); //14
        System.out.println(s.replace("Keshav", "Utkarsh")); // Utkarsh Jha 
        System.out.println(s.replaceFirst("Utkarsh", "Keshav")); // Utkarsh Jha 
        System.out.println(s.replaceAll("Keshav", "Utkarsh")); // Utkarsh Jha 
        System.out.println(s.substring(0, 3));
        System.out.println(s.substring(3));

    }

}
