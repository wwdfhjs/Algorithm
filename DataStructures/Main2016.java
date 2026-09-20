package DataStructures;

public class Main2016 {
    public static void main(String[] args) {

    }
    public int maximumDifference(int[] nums) {
        int min = nums[0];
        int max = 0;
        for (int i = 1; i < nums.length; i++) {
            max = Math.max(max, nums[i] -min);
            min = Math.min(min, nums[i]);
        }
        return max==0?-1:max;
    }
}
