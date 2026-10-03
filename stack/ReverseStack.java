package stack;

import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        Stack<Integer> stack3 = new Stack<>();
        stack1.push(34);
        stack1.push(3);
        stack1.push(54);
        stack1.push(32);
        stack1.push(7);
        System.out.println(stack1);
        moveStack(stack1 , stack2);
        moveStack(stack2 , stack3);
        moveStack(stack3 , stack1);
        System.out.println(stack1);

    }

    private static void moveStack(Stack<Integer> source, Stack<Integer> dest) {
        while(!source.empty()) {
            int item = source.peek();
            dest.push(item);
            source.pop();
        }
    }
}
