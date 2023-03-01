package Sortings;

import java.util.Arrays;

public class MergeSort {
    private void divide(int[] array, int i , int j){
        if(i >= j){
            return;
        }
        int mid = (i+j)/2;
        divide(array, i, mid);
        divide(array, mid+1, j);
        merge(array, i, mid, j);
    }
    

    private void merge(int[] array, int start, int mid, int end){
        int [] merged = new int[end-start+1];
        int i = start;
        int j = mid+1;
        int x = 0;

        while (i <= mid && j <= end){
            if (array[i] <= array[j]){
                merged[x++] = array[i++];
            }
            else{
                merged[x++] = array[j++];
            }
        }

        while (i <= mid){
            merged[x++] = array[i++];
        }

        while(j <= end){
            merged[x++] = array[j++];
        }


        for(int ii = 0 ,jj=start ; ii<merged.length; ii++ ,jj++){
            array[jj] = merged[ii];
        }
        System.out.println(Arrays.toString(array));
    }

    public void printArray(int [] array){
        for(int i : array){
            System.out.print(i+ " ");
        }
        System.out.println();
    }


    public void mergeSort(int[] array){
        int n = array.length-1;
        divide(array, 0, n);
        printArray(array);
    }






    public static void main(String[] args) {
        MergeSort mergeSort = new MergeSort();
        int[] ar = new int[]{8,6,4,1,9,5,2,1,3,4,59,0,3};
        mergeSort.mergeSort(ar);


    }

}
