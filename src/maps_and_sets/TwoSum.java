package maps_and_sets;

import java.util.HashSet;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = { 1, 3, -1, 8, 4, 2 };
        int target = 5;
        System.out.println(findTwoSum(arr, target));
    }

    public static boolean findTwoSum(int[] arr, int target) {
        HashSet<Integer> set = new HashSet<>();
        for (int ele : arr) {
            int rem = target - ele; // ele + rem = target
            if (set.contains(rem))
                return true;
            set.add(ele);
        }
        return false;
    }

}
