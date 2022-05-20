package Stacks;

public class Client {
    public static void main(String[] args) {
        StackUsingArray st = new StackUsingArray(5);

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

//       while (!st.isEmpty()){
//           System.out.println(st.peek());
//           st.pop();
//       }
        System.out.println(st.size());
    }

}
