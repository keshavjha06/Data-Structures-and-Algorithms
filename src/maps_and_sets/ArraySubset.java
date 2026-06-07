package maps_and_sets;

import java.util.HashMap;

public class ArraySubset {

    public static void main(String[] args) {
        int[] a = { 11, 1, 13, 21, 3, 7, 3 };
        int[] b = { 11, 3, 7, 1 };
        System.out.println(isSubset(a, b));
    }

    public static boolean isSubset(int a[], int b[]) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int ele : a) {
            if (map.containsKey(ele)) {
                int freq = map.get(ele);
                map.put(ele, freq + 1);
            } else
                map.put(ele, 1);
        }

        for (int ele : b) {
            if (!map.containsKey(ele))
                return false;
            int freq = map.get(ele);
            if (freq == 0)
                return false;
            map.put(ele, freq - 1);
        }
        return true;
    }

}
