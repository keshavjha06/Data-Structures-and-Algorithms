package OOPS;

import java.util.Scanner;

public class UserDefinedDataType {
    // classes are blueprint and objects are real world entity
    public static class Student {
        String name;
        int rno;
        double cgpa;

        void print() {
            System.out.println(name + " " + rno + " " + cgpa);
        }

    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student(); // declaration
        s1.name = "Sam";
        s1.rno = 32;
        s1.cgpa = 1.0;

        Student s2 = new Student();
        s2.name = "Lavish";
        s2.rno = 33;
        s2.cgpa = 2.2;

        Student s3 = new Student();
        s3.name = "Anagha";
        s3.rno = sc.nextInt();
        s3.cgpa = 7.7;

        System.out.println(s1.name + " " + s1.rno + " " + s1.cgpa);
        s2.cgpa = 9.7;
        System.out.println(s3.rno);

        s1.print();
        s2.print();
        s3.print();

    }
}
