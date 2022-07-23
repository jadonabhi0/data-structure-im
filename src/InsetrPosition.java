class InsertPosition {
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length;
        int mid = 0;
        while(low<=high){
            mid = low+(high-low)/2;
            if (mid<0){
                break;
            }
            if(nums[mid] == target){
                return mid;
            }else if(target > nums[mid]){
                low = mid+1;
            }else{
                high = mid;
            }
        }
        int ans = 0 ;
        for(int i = 0 ; i < nums.length-1 ; i++){
            if (target>nums[i] && target<nums[i+1]){
                ans = i;
                break;
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        int [] array = new int[]{1,2,3,4,5,6};
        InsertPosition i = new InsertPosition();
        System.out.println(i.searchInsert(array, 2));
    }
}