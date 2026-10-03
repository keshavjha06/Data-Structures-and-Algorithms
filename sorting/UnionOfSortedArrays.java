package sorting;

import java.util.ArrayList;

public class UnionOfSortedArrays {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5 };
        int b[] = { 1, 2, 3, 6, 7 };
        System.out.println(UnionOfElements(a, b));
    }

    static ArrayList<Integer> UnionOfElements(int a[], int b[]) {
        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0, j = 0;
        while (i < a.length && j < b.length) {
            if (a[i] == b[j]) {
                ans.add(a[i]);
                i++;
                j++;
            } else if (a[i] < b[j]) {
                ans.add(a[i]);
                i++;
            } else {
                ans.add(b[j]);
                j++;
            }
        }
        while (i < a.length) {
            ans.add(a[i]);
            i++;
        }
        while (j < b.length) {
            ans.add(b[j]);
            j++;
        }
        return ans;
    }

    /* while (i < a.length || j < b.length) {
            int val;
            if (i < a.length && (j == b.length || a[i] < b[j])) {
                val = a[i++];
            } else if (j < b.length && (i == a.length || b[j] < a[i])) {
                val = b[j++];
            } else { // Elements are equal (a[i] == b[j])
                val = a[i++];
                j++;
            }
            // Only add 'val' if it's the first element or different from the previously added element
            if (ans.isEmpty() || ans.get(ans.size() - 1) != val) {
                ans.add(val);
            }
        }
        return ans;
    } */

}
