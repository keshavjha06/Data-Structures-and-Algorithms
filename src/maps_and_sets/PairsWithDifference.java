package maps_and_sets;

import java.util.HashMap;
import java.util.HashSet;

public class PairsWithDifference {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 1, 4, 5 };
        int k = 3;
        System.out.println(countPairs(arr, k));
    }

    static int countPairs(int[] arr, int k) {
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (Math.abs(arr[i] - arr[j]) == k) {
                    set.add(i + "," + j);
                }
            }
        }
        return set.size();
         /*  HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int ele : arr) {
            // Check for both (ele - k) and (ele + k) to find all pairs with absolute difference k
            if (map.containsKey(ele - k)) {
                count += map.get(ele - k);
            }
            if (map.containsKey(ele + k)) {
                count += map.get(ele + k);
            }
            map.put(ele, map.getOrDefault(ele, 0) + 1);
        }
        return count; */
    }
}
