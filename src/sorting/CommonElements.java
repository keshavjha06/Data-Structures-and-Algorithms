package sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class CommonElements {
    public static void main(String[] args) {
        int a[] = { 3, 4, 2, 2, 4 };
        int b[] = { 3, 2 , 2, 7 };
        System.out.println(CommonElements(a, b));
    }

    static ArrayList<Integer> CommonElements(int a[], int b[]) {
        Arrays.sort(a);
        Arrays.sort(b);
        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0, j = 0;
        while (i < a.length && j < b.length) {
            if (a[i] == b[j]) {
                ans.add(a[i]);
                i++;
                j++;
            } else if (a[i] < b[j]) {
                i++;
            } else {
                j++;
            }
        }
        return ans;
    }

}
