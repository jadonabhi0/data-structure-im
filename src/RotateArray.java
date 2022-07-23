import java.util.*;

public class RotateArray {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5,6,7};
        Deque<Integer> queue = new LinkedList<>();
        for(int i : array){
            queue.add(i);
        }

        for (int i = 0 ; i < 3 ; i++){
            queue.addFirst(queue.pollLast());
        }
        int n = queue.size();
        System.out.print("[");
        for (int i = 0; i < n; i++) {
            if (i == n-1){
                System.out.print(queue.pollFirst()+"]");
            }
            else{
                System.out.print(queue.pollFirst()+",");
            }
        }


    }
}
