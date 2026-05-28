package arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = { 20 , 30 , 40 , 20 , 50 , 60 , 70 , 80 , 90 , 100 };
        int target = 70;
        boolean flag = false; // false means target doesn't exist in array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Target exist in array at index " + i);
                flag = true; // true means targe exist in array
                break;
            }
        }
        if (flag) {
            System.out.println("Target exists in Array");
        }
        else  {
            System.out.println("Target missing in Array");
        }
    }
}

// Another way
/*
int target = 20;
int found  =  -1; // -1 means target doesn't exist in array , -1 cannot be index of any array
        for (int i = 0; i < arr.length; i++) {
        if (arr[i] == target) {
        found = i; // any no except - 1 means targe exist in array
        break;
        }
     }
        if (found =! -1) System.out.println("Target exists in Array at index "+ found);
       else System.out.println("Target missing in Array);
                }
       }
 */