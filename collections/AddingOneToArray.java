package collections;

import java.util.Collections;
import java.util.Vector;

public class AddingOneToArray {
    public static void main(String[] args) {
        int[] arr = { 9 , 9 , 9 }; // { 5 , 6, 7 , 8}
        Vector<Integer> ans = new Vector<>();
        int n = arr.length;
        int carry = 1;
        for (int i = n -1; i >= 0; i--) {
            if(arr[i] + carry <= 9){
                ans.add(arr[i]+ carry);
                carry = 0;
            }
             else{  // arr[i] + carry = 10
                ans.add(0);
                carry = 1;
            }
            
        }
        if(carry == 1) ans.add(1);
        Collections.reverse(ans);

        for(int ele: ans){
            System.out.print(ele + " ");
        }


    }

}
