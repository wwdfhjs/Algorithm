package DataStructures;

import java.util.HashMap;
import java.util.Map;

public class Main1512 {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int num : nums) {
            map.put(num, map.getOrDefault(num,0)+1);
        }
        for (int values:map.values()){
            if (values>1){
                int count1=0;//二次计数
                for (int i=values-1;i>0;i--){
                    count1+=i;
                }
                count += count1;
            }
        }
        return count;
    }
}
