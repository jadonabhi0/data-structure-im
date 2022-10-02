package SlindingWindow;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SubArraySumEqualK {

    // example of variable size sliding window
    public static void subArraySum(int[] array, int sum){
        int currSum = array[0];
        int start = 0;

        for(int end = 1 ; end <= array.length ; end++){
            // compressing the window
            while(start < end && currSum > sum){
                currSum -= array[start++];
            }

            // printing the sub-array
            if(sum == currSum){
                for(int i = start ; i < end ; i++){
                    System.out.print(array[i]+" ");
                }
                System.out.println();
            }

            // expanding the window
            if (end < array.length){
                currSum += array[end];
            }



        }
    }




    public static void main(String[] args) {
        int[] array = {1, 4, 20, 3, 10, 5, 25, 8, 23, 10, 20, 15, 15, 3};
//        System.out.println(Arrays.stream(array, 1, 3).boxed().collect(Collectors.toList()));
//        subArraySum(array, 33);
    }
}
