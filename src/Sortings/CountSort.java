package Sortings;

import java.util.Arrays;

public class CountSort {

    // time complexity O(N+K) K --> range
    public void countSort(int[] array, int range){
        int[] count = new int[range+1];

        for(int i : array){
            count[i] += 1;
        }
        int x = 0;
        for(int i = 0 ; i < count.length ; i++){
            int j = count[i];
            while (j-- > 0){
                array[x++] = i;
            }
        }

        System.out.println(Arrays.toString(array));

    }


    public static void main(String[] args) {

        int[] ar = {1,6,4,3,6,8,9,2,3,4,5};
        CountSort countSort = new CountSort();
        countSort.countSort(ar, 9);

    }

}
