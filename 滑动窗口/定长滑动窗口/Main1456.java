package 定长滑动窗口;

import java.util.Scanner;

public class Main1456 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int k = sc.nextInt();

    }
    public int maxVowels(String s, int k) {
        int count = 0;
        int ans=0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                count++;
            }
            int left =i-k+1;
            if (left<0){
                continue;
            }
            ans=Math.max(ans,count);
            if (s.charAt(left)=='a'||s.charAt(left)=='e'||s.charAt(left)=='i'||s.charAt(left)=='o'||s.charAt(left)=='u'){
                count--;
            }
        }
        return ans;
    }
}
