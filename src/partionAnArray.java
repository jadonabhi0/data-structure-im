import java.util.Arrays;

public class partionAnArray {

    private void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public void partion(int[] array ){
        int piv = array[0];
        int i = 0;
        int j = array.length-1;
        while (i < j){
            while (array[0] <= piv && i < j) i++;
            while (array[0] > piv) j--;
            if (i < j) swap(array, i, j);
        }
        swap(array, 0, j);
        System.out.println(Arrays.toString(array));
    }



    public static void main(String[] args) {
        partionAnArray partionAnArray = new partionAnArray();
        int[] ar = new int[]{5,4,1,2,3,6,7,89,43,2,4,5,6};
        partionAnArray.partion(ar);
    }
}
