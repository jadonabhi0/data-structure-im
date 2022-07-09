package Searchings;

public class BinarySearch {


    // time complexity O(log(n))
    private boolean search(int[] array, int low , int high, int tar){

        while(low <= high){
            int mid = (low+high)/2;

            if (array[mid] == tar) return true;
            if (array[mid] < tar){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return false;
    }

    public boolean binarySearch(int[] array, int tar){
        int n = array.length-1;
        return search(array, 0, n, tar);
    }


    public static void main(String[] args) {
        int[] array = {1,2,3,6,7,9};
        BinarySearch bs = new BinarySearch();
        System.out.println(bs.binarySearch(array, 9));
    }

}
