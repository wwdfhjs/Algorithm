package 单序双指针;

import java.util.Scanner;

public class Main345 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(reverseVowels(s));
    }
    public static String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int left=0;
        int right=chars.length-1;
        while(left<right){
            while (!("aeiouAEIOU".indexOf(left)>=0&&left<right)){
                left++;
            }
            while (!("aeiouAEIOU".indexOf(right)>=0&&right>left)){
                right--;
            }
            char temp = chars[left];
            chars[left]=chars[right];
            chars[right]=temp;
            left++;
            right--;
        }
        return new String(chars);
    }
}
