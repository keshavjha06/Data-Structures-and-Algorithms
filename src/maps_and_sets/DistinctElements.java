package maps_and_sets;

import java.util.HashSet;

public class DistinctElements {
    public static void main(String[] args) {
        int[] arr = { 2, 2, 3, 2 };
        System.out.println(countDistinct(arr));
    }

    static int countDistinct(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        /* for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        } */
        for (int ele : arr) {
            set.add(ele);
        }
        return set.size();
    }
}
