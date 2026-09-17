package 单序双指针;

public class Main541 {
    public String reverseStr(String s, int k) {
        char[] chars=s.toCharArray();
        for (int i = 0; i < s.length(); i +=2*k) {
            reverse(chars,i,Math.min(i+k,s.length())-1);
        }
        return new String(chars);
    }
    public static void reverse(char[] s,int left,int right) {
        while (left < right) {
            char temp=s[left];
            s[left]=s[right];
            s[right]=temp;
            left++;
            right--;
        }
    }
}
