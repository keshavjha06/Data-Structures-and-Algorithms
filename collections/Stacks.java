package collections;

import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        System.out.println(st); // [10, 20, 30, 40]
        st.pop();
        System.out.println(st); // [10, 20, 30]
        System.out.println(st.peek()); // 30
        System.out.println(st.search(50)); // -1
        System.out.println(st.isEmpty()); // false
        st.clear();
        System.out.println(st.isEmpty()); // true
    }
}
