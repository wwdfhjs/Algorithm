package 不定长滑动窗口;

public class Main3794 {
    public String reversePrefix(String s, int k) {
        int left=0;
        int right=k-1;
        char[] chars=s.toCharArray();
        while (left<right){
            char l=chars[left];
            char r=chars[right];
            chars[left]=r;
            chars[right]=l;
            left++;
            right--;
        }
        return new String(chars);
    }
    //库函数解法
//    public String reversePrefix(String s, int k) {
//        StringBuilder ans = new StringBuilder(s.substring(0, k)).reverse();
//        ans.append(s.substring(k));
//        return ans.toString();
//    }
}
