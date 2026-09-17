package 定长滑动窗口;

public class Main643 {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        int ans = Integer.MIN_VALUE;//避免有负数的存在
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            int left =i-k+1;
            if (left < 0){
                continue;
            }
            ans = Math.max(ans, sum);
            sum -= nums[left];
        }
        return (double) ans/k;
    }
}
