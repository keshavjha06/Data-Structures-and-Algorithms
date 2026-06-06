package maps_and_sets;

import java.util.ArrayList;
import java.util.HashSet;

public class MissingElementInRange {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 5, 7, 10 };
        int low = 1, high = 10;
        System.out.println(missingRange(arr, low, high));
    }

    public static ArrayList<Integer> missingRange(int[] arr, int low, int high) {
        HashSet<Integer> set = new HashSet<>();
        for (int ele : arr) {
            set.add(ele);
        }
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = low; i <= high; i++) {
            if (!set.contains(i)) {
                result.add(i);
            }
        }
        return result;
    }

}
