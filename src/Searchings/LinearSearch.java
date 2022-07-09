package Searchings;

public class LinearSearch {

    // time complexity O(n)
    public static boolean linearSearch(int[] array, int tar){
        for(int i : array){
            if (i == tar){
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        System.out.println(linearSearch(new int[]{3, 4, 6, 1, 2, 3, 8, 6, 5, 4}, 1));
    }


}
