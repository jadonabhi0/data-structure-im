package SlindingWindow;

import java.util.LinkedList;
import java.util.Stack;

public class MaximumSlidingWindow {

    public static LinkedList<Integer>  helper(int[] array,int k){
        LinkedList<Integer> list = new LinkedList<>();
        int[] gr =new int[array.length];
        Stack<Integer> st = new Stack<>();
        gr[array.length-1] = array.length;
        st.push(array.length-1);

        for(int i = array.length-2 ; i >= 0 ; i--){
            if (st.size() > 0 && array[i] >= array[st.peek()] ){
                st.pop();
            }
            if (st.size() == 0){
                gr[i] = array.length;
            }else{
                gr[i] = st.peek();
            }
            st.push(i);
        }

        int j = 0;
        for (int i = 0 ; i < array.length - k; i++){
            if (j < i) j = i;
            while(gr[j] < i + k){
                j = gr[j];
            }

            list.add(array[j]);

        }
        return list;
    }


    public static void main(String[] args) {
        int [] array = new int[]{3,2,1,6,9,5,4,5,8,6,0,5,1};
        LinkedList<Integer> list = helper(array,3);
        int[] arr = new int[list.size()];
        int c = 0;
        for (int i : list){
            arr[c++] = i;
        }
    }

}
