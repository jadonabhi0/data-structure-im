package Searchings;

public class BinarySearchRecursive {

    // time complexity O(log(n))
    private boolean search(int [] array, int tar, int low, int high){
        if (low > high)return false;

        int mid = (low+high)/2;
        if (array[mid] == tar) return true;
        if (array[mid] < tar){
            return search(array, tar, mid+1, high);
        }else{
            return search(array, tar, low, mid-1);
        }

    }

    public boolean binarySearch(int[] array, int tar){
        return search(array,tar, 0, array.length-1 );
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,6,7,9};
        BinarySearchRecursive bs = new BinarySearchRecursive();
        System.out.println(bs.binarySearch(array, 11));
    }
}
