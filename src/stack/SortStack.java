package stack;

import java.util.Stack;

public class SortStack {
        public static void main(String[] args) {
            Stack<Integer> stack1 = new Stack<>();
            stack1.push(34);
            stack1.push(3);
            stack1.push(54);
            stack1.push(32);
            stack1.push(7);

            System.out.println("Original stack: " + stack1);
            Stack<Integer> sortedStack = sortStack(stack1);
            System.out.println("Sorted stack: " + sortedStack);
        }

        private static Stack<Integer> sortStack(Stack<Integer> stack1) {
            Stack<Integer> tempStack = new Stack<>();

            // Process elements from stack1
            while (!stack1.isEmpty()) {
                // Pop an element from stack1
                int temp = stack1.pop();

                // Move elements from tempStack back to stack1 if they are greater than temp
                while (!tempStack.isEmpty() && tempStack.peek() > temp) {
                    stack1.push(tempStack.pop());
                }

                // Push the current element into tempStack at the correct position
                tempStack.push(temp);
            }

            // tempStack now contains the sorted elements
            return tempStack;
        }
}
