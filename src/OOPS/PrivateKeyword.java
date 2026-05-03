package OOPS;

import java.util.Scanner;

class Students {
    String name; // null default values
    private int rno; // 0
    double cgpa; // 0.0

    void print() { // getter
        System.out.println(name + " " + rno + " " + cgpa);
    }

    int getRno() { // getter
        return rno;
    }

    void setRno(int x) { // setter
        rno = x;
    }
}

public class PrivateKeyword {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Students s = new Students();
        s.print();
        // System.out.println(s.rno);
        s.name = "Jack";
        s.cgpa = 8.9;
        // s.rno = 45; error
        s.setRno(45);
        System.out.println(s.getRno());

        StringBuilder sb = new StringBuilder(sc.nextLine());
        System.out.println(sb); // prints the same given input



    }

}
