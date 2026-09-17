package 单序双指针;

import java.util.Scanner;

public class Main151 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(reverseWords(s));
    }
    public static String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String ss=s.trim(); //删除首尾空格
        int end=ss.length()-1;
        while (end>=0){
            int right=end;
            while (end>=0 && ss.charAt(end)!=' '){
                end--;
            }
            sb.append(ss.substring(end+1,right+1));
            sb.append(' ');
            while (end>=0 && ss.charAt(end)==' '){
                end--;
            }
        }
        return new String(sb).trim();
    }
}
