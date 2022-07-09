import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Min_abs_difference {

    static List<Integer> list = new ArrayList<>();
    int min = Integer.MAX_VALUE;
    private int[] divide(int[] array, int start, int end){
        if (start >= end) {
            int[] base = new int[1];
            base[0] = array[start];
            return base;
        }

        int mid = (start+end)/2;

        int[] left = divide(array, start, mid);
        int[] right = divide(array, mid+1, end);
        int[] merged = helper(left, right);
        return merged;
    }
    private int[] helper(int[] left, int[] right){
        int i = 0 ;
        int j = 0 ;
        while(i < left.length){
            while (j < right.length){
                list.add(Math.abs(left[i]-right[j]));
                j++;
            }
            i++;
        }
        int[] array = new int[1];
        return array;
    }

    public static void main(String[] args) {
        int[] array = {1,3,1};
        Min_abs_difference m = new Min_abs_difference();
        m.divide(array, 0, array.length-1);
        System.out.println(list);
    }
}
