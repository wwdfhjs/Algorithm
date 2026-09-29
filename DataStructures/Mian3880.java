package DataStructures;

public class Mian3880 {
    public int minAbsoluteDifference(int[] nums) {
        int n = nums.length;
        int ans = n;
        // last[x] 表示 x+1 上一次出现的位置
        int[] last = {-n, -n}; // i - (-n) >= n，不会让 ans 变小

        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            if (x > 0) {
                // 如果 x 是 1，那么找上一个 2 的位置
                // 如果 x 是 2，那么找上一个 1 的位置
                x--;
                ans = Math.min(ans, i - last[x ^ 1]);
                last[x] = i;
            }
        }
        return ans == n ? -1 : ans;
    }
}
