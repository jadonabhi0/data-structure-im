package Sortings;

import java.util.Arrays;
import java.util.Queue;

public class QuickSort {

    // Time complexity O(nLog(n))

    private void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private int partion(int[] arary,int low , int high){
        int piv = arary[low];
        int i = low;
        int j = high;
        while (i < j){
            while (arary[i] <= piv && i < j) i++;
            while (arary[j] > piv) j--;
            if (i < j) swap(arary, i, j);
        }
        swap(arary,low, j);
        return j;
    }

    private void quick(int[] array, int l, int h){
       if (l<h){
           int piv = partion(array,l,h);
           quick(array, l, piv-1);
           quick(array, piv+1, h);
       }
    }

    private void printArray(int[] array){
        for (int i : array){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public void quickSort(int[] array){
        int n = array.length-1;
        quick(array, 0, n);
        printArray(array);
    }

    public static void main(String[] args) {

        QuickSort quickSort = new QuickSort();
        int[] ar = {9,1,5,3,6,8,-1,213,3,2,4,6};
        quickSort.quickSort(ar);
    }






}
