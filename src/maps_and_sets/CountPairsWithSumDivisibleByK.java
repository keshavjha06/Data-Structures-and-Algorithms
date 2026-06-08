package maps_and_sets;

import java.util.HashMap;

public class CountPairsWithSumDivisibleByK {

    public static void main(String[] args) {
        int[] arr = { 2, 2, 1, 7, 5, 3 };
        int k = 4;
        // 5 pairs possible whose sum is divisible by '4' -> (2, 2), (1, 7), (7, 5), (1, 3) & (5, 3).
        System.out.println(countKdivPairs(arr, k));
    }

    public static int countKdivPairs(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int ele : arr) {
            int rem = ((ele % k) + k) % k;
            map.put(rem, map.getOrDefault(rem, 0) + 1);
        }
        int ans = 0;

        for (int ele : arr) {
            int rem = ((ele % k) + k) % k;
            map.put(rem, map.get(rem) - 1);
            int target = (k - rem) % k;
            ans = ans + map.getOrDefault(target, 0);
        }

        return ans;
    }

}
