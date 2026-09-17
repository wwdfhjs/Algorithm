public class Main34 {
    public  static int lower(int []nums,int target){
        int left = 0;
        int right = nums.length-1;
        while(left<=right){
            int mid = left+(right-left)/2;
            if (nums[mid]<target){
                left = mid+1;
            }else {
                right = mid-1;
            }
        }
        return left;
    }
    public int[] searchRange(int[] nums, int target) {
        int home=lower(nums,target);
        if(home== nums.length||nums[home]!=target){
            return new int[]{-1,-1};
        }
        int right=lower(nums,target+1)-1;
        return new int[]{home,right};
    }
}
