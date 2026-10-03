package stack;

import java.util.Stack;

public class InsertOnAnyIndex {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(34);
        s.push(3);
        s.push(54);
        s.push(32);
        s.push(7);
        insertInTheMiddle(3, 100, s);
        System.out.println("Stack after insertion: " + s);
    }

    public static void insertInTheMiddle(int index, int value, Stack<Integer> s) {
        Stack<Integer> temp = new Stack<>();
        int originalSize = s.size();

        // Pop elements from the original stack until reaching the target index
        for (int i = 0; i < originalSize - index; i++) {
            temp.push(s.pop());
        }

        // Push the new value at the desired index
        s.push(value);

        // Restore the elements from the temporary stack
        while (!temp.empty()) {
            s.push(temp.pop());
        }
    }
}
