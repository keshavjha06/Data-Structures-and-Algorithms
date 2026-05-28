package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(25);
        arr.add(12);
        arr.add(2);
        arr.add(89);
        arr.add(9);
        System.out.println(arr.get(2)); // arr[2]
        arr.set(3, 50); // arr[3] = 50
        System.out.println(arr); // not traversing the array by ourselves
         
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }

        System.out.println();

        for (int ele : arr) {
            System.out.print(ele + " ");
        }

        // 25 12 2 50 9
        arr.add(78); // 25 12 2 50 9 78
        arr.add(1, 100);
        System.out.println(arr); // 25 100 12 2 50 9 78
        arr.remove(arr.size() - 1);
        System.out.println(arr);

        int i = 0, j = arr.size() - 1;
        while( i < j) {
            int temp = arr.get(i);
            arr.set(i , arr.get(j));
            arr.set(j , temp);
            i++;
            j--;
        }

        // Collections.reverse(arr);
        System.out.println(arr);
        ArrayList<Character> arr2 = new ArrayList<>();
        ArrayList<String> arr3 = new ArrayList<>();
    }

}
