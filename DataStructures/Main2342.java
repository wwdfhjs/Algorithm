package DataStructures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main2342 {
    public int maximumSum(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int num = sum(nums[i]);
            if (map.containsKey(num)) {
                int sum = map.get(num) + nums[i];
                maxSum = Math.max(maxSum, sum);
                map.put(num,Math.max(nums[i],map.get(num)));
            }else {
                map.put(num,nums[i]);
            }
        }
        return maxSum!=Integer.MIN_VALUE?maxSum:-1;
    }
    //计算位数和
    public static int sum(int num){
        int sum = 0;
        while (num > 0){
            sum += num%10;
            num /= 10;
        }
        return sum;
    }
}
