package 单序双指针;

import java.util.Scanner;

public class Main557 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(reverseWords(s));
    }
    public static String reverseWords(String s) {
        char[] chars = s.toCharArray();
        int i=0;
        while (i<chars.length){
            int left=i;
            while (i<chars.length&&chars[i]!=' '){
                i++;
            }
            int right=i-1;
            while (left<right){
                char temp=chars[left];
                chars[left]=chars[right];
                chars[right]=temp;
                left++;
                right--;
            }
            while (i<chars.length&&chars[i]==' '){
                i++;
            }
        }
        return new String(chars);
    }
}
