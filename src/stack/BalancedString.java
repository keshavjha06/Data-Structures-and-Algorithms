package stack;

import java.util.Stack;

public class BalancedString {
    public static void main(String[] args) {
        String s = "(2+)[{4}]";
        System.out.println(isBalanced(s));  // Should return true
    }

    private static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();

        // Iterate through the characters in the string
        for (char c : s.toCharArray()) {
            // Push opening brackets into the stack
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }

            // Handle closing brackets
            if (c == ')' || c == '}' || c == ']') {
                // Check if there's a corresponding opening bracket in the stack
                if (stack.isEmpty()) {
                    return false;  // No matching opening bracket
                }
                char top = stack.pop();  // Pop the top opening bracket

                // Check for mismatched pair
                if ((top == '(' && c != ')') || (top == '{' && c != '}') || (top == '[' && c != ']')) {
                    return false;  // Brackets are not balanced
                }
            }
        }

        // If stack is not empty, there are unmatched opening brackets
        return stack.isEmpty();
    }
}
