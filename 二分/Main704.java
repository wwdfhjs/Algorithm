public class Main704 {
    public int search(int[] nums, int target) {
        int left = -1;
        int right = nums.length;
        while (left + 1 < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] >=target) {
                right = mid;
            }else{
                left = mid;
            }
        }
        if (nums[right] == target) {
            return right;
        }else {
            return -1;
        }
    }
}
