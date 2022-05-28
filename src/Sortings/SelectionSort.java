package Sortings;

public class SelectionSort {

    // Time complexity is O(n^2)
    public void selectionSort(int[] array){

        // Selection Sort
        for(int i = 0 ; i < array.length ; i++){
            int min = i;
            for (int j = i+1 ; j < array.length ; j++){

                if (array[min] > array[j]){
                    min = j;
                    /*
                      this sorting is similar to bubble sort,
                      but difference is that we are reducing the
                      swaps in this sorting in this place;
                    */
                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;

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
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.selectionSort(new int[]{9,8,0,2,3,5,1,2,6,4,3});
    }
}
