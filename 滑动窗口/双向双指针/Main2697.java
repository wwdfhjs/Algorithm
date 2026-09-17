package 双向双指针;

import java.util.Scanner;

public class Main2697 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(makeSmallestPalindrome(s));
    }
    public static String makeSmallestPalindrome(String s) {
        char[] chars = s.toCharArray();
        int lenght = chars.length;
        int left = 0;
//        int count = 0;
        int right = lenght-1;
        while (left < right) {
            if (chars[left] != chars[right]&&chars[left]<chars[right]) {
                chars[right]=chars[left];
            }else if (chars[left] != chars[right]&&chars[left]>chars[right]){
                chars[left]=chars[right];
            }
            left++;
            right--;
        }
        return new String(chars);
    }
}
