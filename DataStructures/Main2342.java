package DataStructures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main2342 {
    public int maximumSum(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int maxSum = -1;
        for (int i = 0; i < nums.length; i++) {
            int num = digitSum(nums[i]);
            if (map.containsKey(num)) {
                maxSum = Math.max(maxSum, map.get(num) + nums[i]);
                map.put(num,Math.max(nums[i],map.get(num)));
            }else {
                map.put(num,nums[i]);
            }
        }
        return maxSum;
    }
    //计算位数和
    public static int digitSum(int num){
        int sum = 0;
        while (num > 0){
            sum += num%10;
            num /= 10;
        }
        return sum;
    }
}
