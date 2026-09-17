package 不定长滑动窗口;

import java.util.HashMap;
import java.util.Map;

public class Main3090 {
    public int maximumLengthSubstring(String s) {
        int left = 0;
        int right = 0;
        int ans = 0;
        Map<Character, Integer> map = new HashMap<>();
        while (right < s.length()) {
            map.put(s.charAt(right), map.getOrDefault(s.charAt(right), 0) + 1);
            while (map.get(s.charAt(right)) >2) {
                map.put(s.charAt(left), map.getOrDefault(s.charAt(left), 0) - 1);
                if (map.get(s.charAt(left)) == 0) {
                    map.remove(s.charAt(left));
                }
                left++;
            }
            ans = Math.max(ans, right - left+1);
            right++;
        }
        return ans;
    }
}
