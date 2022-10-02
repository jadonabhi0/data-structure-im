package SlindingWindow;

public class FixSizeSlidingWindow {

    public static int helper(int [] array, int k){
        int start = 0;
        int curSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0 ; i < array.length ; i++){
            if (i < k) curSum+=array[i];
            else {
                maxSum = Math.max(maxSum, curSum);
                curSum -= array[start++];
                curSum += array[i];
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        System.out.println(helper(new int[]{10, 20, 23, 5, 8, 20, 100, 5}, 5));
    }
}
