package stack;

import java.util.Stack;

public class MinElement {
    static Stack<Integer> mainStack = new Stack<>();
    static Stack<Integer> temp = new Stack<>();


    public static void main(String[] args) {
        customPush(12);
        customPush(6);
        customPop();
        customPush(20);
        customPush(17);
        customPush(8);
        customPush(3);
        System.out.println("The minimum element is : " + temp.peek());

    }

    private static void customPush(int i) {
        mainStack.push(i);
        if (temp.isEmpty())
            temp.push(i);
        else if (temp.peek() > i) // check if top element in temp element is higher than mainstack element , if so push it to temp stack
            temp.push(i);
    }

    private static void customPop() {
        int item = mainStack.peek();
        mainStack.pop();
        if (temp.peek() == item) { // if top element in temp stack is equal to top element in main stack , perform pop
            temp.pop();
        }
    }


}
