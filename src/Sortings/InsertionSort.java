package Sortings;

public class InsertionSort {


    // Time Complexity O(N^2)
    public void  insertionSort(int[] array){

        // insertion sort
        for(int i = 1 ; i < array.length ; i++){
            int curr = array[i];
            int j = i-1;

            while (j >= 0 && array[j] > curr){
                array[j+1] = array[j];
                j--;
            }
            // place
            array[j+1] = curr;
        }
        printArray(array);
    }


    public void printArray(int[] array){
        for (int i : array){
            System.out.print(i+" ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.insertionSort(new int[]{6,7,8,23,5,6,8,9,1,0});
    }

}
