package Sortings;

public class BubbleSort {


    // Time complexity O(n^2)
    public void BubbleSort(int[] array){

        //bubble sort
        for(int i = 0 ; i < array.length ;i++){
            for(int j = 0 ; j < array.length-1-i ; j++){
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1] ;
                    array[j+1] = temp;
                }
            }
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
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.BubbleSort(new int[]{7,4,6,9,0,1,3,4,5,6,4,5,7,9});
    }

}
