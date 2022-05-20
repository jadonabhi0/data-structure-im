package Stacks;

import java.util.Stack;

public class AddBottomOfStack {

    public static void add(Stack<Integer> st, int data){

        if (st.isEmpty()){
            st.push(data);
            return;
        }
        int n = st.pop();
        add(st, data);
        st.push(n);
    }

    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        add(st,6);
        System.out.println(st);
    }

}
