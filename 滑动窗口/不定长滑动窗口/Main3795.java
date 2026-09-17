package 不定长滑动窗口;

import java.util.Scanner;

public class Main3795 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int []counts = new int[n];
        for (int i = 0; i < n; i++) {
            counts[i] = scanner.nextInt();
        }
        System.out.println(minLength(counts, k));
    }
    public static int minLength(int[] nums, int k) {
        int right=0;
        int left=0;
        int sum=0;
        int ans=Integer.MAX_VALUE;
        if (nums.length==1&&nums[0]<k){
            return -1;
        }
        while (right<nums.length){
            sum+=nums[right];
            if (sum>=k){
                ans=Math.min(ans,right-left+1);
                sum-=nums[left];
                left++;
            }
            right++;
        }
        return ans;
    }
}
