package 定长滑动窗口;

import java.util.Arrays;
import java.util.Scanner;

public class Main2090 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int[] nums=new int[n];
        int k=scanner.nextInt();
        for(int i=0;i<n;i++){
            nums[i]=scanner.nextInt();
        }
        int []ans=getAverages(nums,k);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
    public static int[] getAverages(int[] nums, int k) {
        long sum = 0;
        int []ans=new int[nums.length];
        Arrays.fill(ans,-1);
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if (i<k*2){
                continue;
            }
            ans[i-k]=(int)(sum/(k*2+1));
            sum-=nums[i-2*k];
        }
        return ans;
    }
}
