package strings;

import java.util.*;

public class MostFrequentCharacter {
    public static void main(String[] args) {
        String s = "testsample";
       /*  int n = s.length();
        int maxFreq = -1;
        char ans = s.charAt(0);
        char[] arr = s.toCharArray();
        Arrays.sort(arr); // aeelmpsstt
        int i = 0, j = 0;
        // sliding window
        while (j < n) {
            if (arr[i] == arr[j])
                j++;
            else {
                int freq = j - i;
                if (freq > maxFreq) {
                    maxFreq = freq;
                    ans = arr[i];
                }
                i = j;
            }
        }
        int freq = j - i;
        if (freq > maxFreq) {
            maxFreq = freq;
            ans = arr[i];
        }
        System.out.println(ans); */ // e

        // Another approach (Frequency Array)
        int n = s.length();
        int[] freq = new int[26]; // default values are 0
        for(int i = 0; i < n;i++){
            char ch = s.charAt(i);
            int index = ch - 97; // or ch - 'a'
            freq[index]++;
        }
        int maxFreq = 0;
        char ans = s.charAt(0);
        for(int i = 0;i< 26;i++){
            if(freq[i] > maxFreq){
                maxFreq = freq[i];
                ans = (char)(i + 97);
            }
        }
        System.out.println(ans);

       
    }

}
