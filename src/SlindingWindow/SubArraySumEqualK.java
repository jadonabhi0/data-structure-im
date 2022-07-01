package SlindingWindow;

public class SubArraySumEqualK {

    public static void helper(int[] array, int k){
        int start = 0;
        int sum = array[0];
        for (int end = 1 ; end <= array.length ; end++){

            // compression of window
            while (sum > k && start < end -1){
                sum -= array[start++];
            }
            // printing the sub array
            if (sum == k){
                for (int i = start ; i < end ; i++){
                    System.out.print(array[i]+" ");
                }
                System.out.println();
            }

            // expansion of window
            if (end < array.length){
                sum += array[end];
            }

        }

    }


    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,3,3,3,4,2};
        helper(array,6);
    }
}
