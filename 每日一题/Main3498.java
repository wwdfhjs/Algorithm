package 每日一题;

import java.util.HashMap;
import java.util.Map;

public class Main3498 {
    public static void main(String[] args) {

    }
    public int reverseDegree(String s) {
        char[] chars = s.toCharArray();
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            ans += ('{' - s.charAt(i)) * (i + 1); // 下标从 1 开始
        }
        return ans;
    }
}
