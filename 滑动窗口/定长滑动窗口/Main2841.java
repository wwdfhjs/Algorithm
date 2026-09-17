package 定长滑动窗口;

import java.util.HashMap;
import java.util.List;

public class Main2841 {
    public long maxSum(List<Integer> nums, int m, int k) {
        long ans=0;
        long max=0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.size(); i++) {
            max+=nums.get(i);
            map.put(nums.get(i), map.getOrDefault(nums.get(i), 0) + 1);
            if (i<k-1){
                continue;
            }
            if (map.size()>=m){
                ans=Math.max(ans,max);
            }
            max-=nums.get(i-k+1);
            map.put(nums.get(i-k+1), map.getOrDefault(nums.get(i-k+1), 0) - 1);
            if (map.get(nums.get(i-k+1)) == 0){
                map.remove(nums.get(i-k+1));
            }
        }
        return ans;
    }
}
