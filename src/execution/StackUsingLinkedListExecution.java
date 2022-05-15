package execution;

import defination.StackUsingLinkedList;

public class StackUsingLinkedListExecution {
    static StackUsingLinkedList st = new StackUsingLinkedList();

    public static void main(String[] args) {
        st.push(5);
        st.push(6);
        st.push(3);
        st.push(52);
        st.push(58);
        st.pop(); // currently, not working
       st.print();



    }

}
