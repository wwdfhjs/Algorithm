package 不定长滑动窗口;

import java.util.HashMap;
import java.util.Map;

public class Main1695 {
    public int maximumUniqueSubarray(int[] nums) {
        int i = 0;
        int count = 0;
        int ans = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int j = 0; j < nums.length; j++) {
            map.put(nums[j], map.getOrDefault(nums[j], 0) + 1);
            count += nums[j];
             while (map.get(nums[j]) > 0) {
                 map.put(nums[i], map.get(nums[i]) - 1);
                 if (map.get(nums[i]) == 0) {
                     map.remove(nums[j]);
                 }
                 count-=nums[i];
             }
             ans = Math.max(ans, count);
        }
        return ans;
    }
}
