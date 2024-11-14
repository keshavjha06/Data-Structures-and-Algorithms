package stack;

import java.util.Stack;

public class StackMethods {
    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();
        System.out.println(stack1.empty());
        stack1.push(34);
        stack1.push(3);
        stack1.push(54);
        stack1.push(32);
        stack1.push(7);
        System.out.println(stack1);
        stack1.pop(); // LIFO
        System.out.println(stack1);
        int peekedValue = stack1.peek();
        System.out.println(peekedValue);
        System.out.println(stack1);
        System.out.println(stack1.contains(54));
        stack1.insertElementAt(100, 2);
        System.out.println(stack1);
        stack1.remove(0);
        System.out.println(stack1);
    }
}
