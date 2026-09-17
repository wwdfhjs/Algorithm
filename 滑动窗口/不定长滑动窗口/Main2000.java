package 不定长滑动窗口;

import java.util.Scanner;

public class Main2000 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char a = sc.nextLine().charAt(0);
        System.out.println(reversePrefix(s, a));
    }
    public static String reversePrefix(String word, char ch) {
        char[] chars = word.toCharArray();
        int index=-1;
        for (int i = 0; i < word.length()&&index==-1; i++) {
            if (chars[i]==ch) {
                index=i;
            }
        }
        int left=0;
        int right=index;
        while (left<right){
            char cleft=chars[left];
            char cright=chars[right];
            chars[left]=cright;
            chars[right]=cleft;
            left++;
            right--;
        }
        return new String(chars);
    }
}
