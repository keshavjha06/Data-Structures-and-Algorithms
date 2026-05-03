package OOPS;

import java.util.Arrays;

public class Marks {
    public static class StudentData{
        String name;
        int rno;
        int size;
        int[] marks;
         StudentData(int[] s) {
             // marks = s; // output -> 40
            marks = Arrays.copyOf(s, s.length);
        }

        StudentData(int s) {
             marks = new int[s];
        }

    }
    static void main(String[] args) {
        int[] arr = {4, 1, 7, 3, 5};
        StudentData s1 = new StudentData(arr);
        s1.marks[0] = 40;
        System.out.println(arr[0]);
        StudentData s2 = new StudentData(2);

    }
}
