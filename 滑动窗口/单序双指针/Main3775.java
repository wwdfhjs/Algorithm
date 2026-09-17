package 单序双指针;

public class Main3775 {
    public String reverseWords(String s) {
        String[] a = s.split(" ");
        int cnt0 = countVowel(a[0]);
        for (int i = 1; i < a.length; i++) {
            if (countVowel(a[i]) == cnt0) {
                a[i] = new StringBuilder(a[i]).reverse().toString();
            }
        }
        return String.join(" ", a);
    }

    private int countVowel(String s) {
        int cnt = 0;
        for (char c : s.toCharArray()) {
            if ("aeiou".indexOf(c) >= 0) {//查找字符 c 在字符串中第一次出现的位置
                cnt++;
            }
        }
        return cnt;
    }
}
