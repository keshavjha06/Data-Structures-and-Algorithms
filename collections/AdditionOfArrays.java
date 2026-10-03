package collections;

import java.util.ArrayList;
import java.util.Collections;

public class AdditionOfArrays {
    public static void main(String[] args) {
        // Addition of { 3 , 5 , 2 , 0 ,7} + { 9 , 2, 1} = { 3 , 6, 1, 2 , 8}
        int[] arr1 = { 3, 5, 2, 0, 7 };
        int[] arr2 = { 9, 2, 1 };
        int n = arr1.length;
        int m = arr2.length;
        ArrayList<Integer> ans = new ArrayList<>();
        int i = n - 1, j = m - 1;
        int carry = 0;
        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;
            if (i >= 0) {
                sum = sum + arr1[i];
                i--;
            }
            if (j >= 0) {
                sum = sum + arr2[j];
                j--;
            }
            ans.add(sum % 10);
            carry = sum / 10;
        }
        Collections.reverse(ans);

        for (int ele : ans) {
            System.out.print(ele + " ");
        }
    }

}
