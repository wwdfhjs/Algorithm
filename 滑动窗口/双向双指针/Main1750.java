package 双向双指针;

public class Main1750 {
    public int minimumLength(String s) {
        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        while (left < right&&chars[left]==chars[right]) {
            char c=chars[left];
            while (left<right&&chars[left]==c) {
                left++;
            }
            while (left<right&&chars[right]==c) {
                right--;
            }
        }
        return right - left+1;
    }
}
