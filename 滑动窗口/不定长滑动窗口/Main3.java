package 不定长滑动窗口;

import java.util.HashMap;
import java.util.Map;

public class Main3 {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>(); // 用于存储字符及其索引
        int maxLength = 0; // 用于记录最长不重复子串的长度
        int left = 0; // 左指针，表示当前窗口的起始位置
        for (int right = 0; right < s.length(); right++) { // 右指针，表示当前窗口的结束位置
            char currentChar = s.charAt(right);
            if (map.containsKey(currentChar)) {
                // 如果当前字符已经在 map 中，更新左指针到重复字符的下一个位置
                left = Math.max(left, map.get(currentChar) + 1);
            }
            // 更新当前字符的索引
            map.put(currentChar, right);
            // 更新最长不重复子串的长度
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}
