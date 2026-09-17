public class Main35 {
    public int searchInsert(int[] nums, int target) {
        int left = -1;
        int right = nums.length;
        while (left +1 < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] >=target) {
                right = mid;
            }else {
                left = mid;
            }
        }
        return right;
    }
    public int searchInsert1(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] >=target) {
                right = mid-1;
            }else {
                left = mid-1;
            }
        }
        return left;
    }
}
