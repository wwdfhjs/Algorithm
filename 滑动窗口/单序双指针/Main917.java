package 单序双指针;

import java.util.Scanner;

public class Main917 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(reverseOnlyLetters(s));
    }
    public static String reverseOnlyLetters(String s) {
        char[] chars = s.toCharArray();
        int left=0;
        int right=chars.length-1;
        while (left<right){
            while (!((chars[left]>='a'&&chars[left]<='z'&&left<=right)||(chars[left]>='A'&&chars[left]<='Z'&&left<=right))){
                left++;
            }
            while (!((chars[right]>='a'&&chars[right]<='z'&&left<=right)||(chars[right]>='A'&&chars[right]<='Z'&&left<=right))){
                right--;
            }
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        return new String(chars);
    }
}
