package 不定长滑动窗口;

import java.util.Arrays;
import java.util.Scanner;

public class Main3634 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int k = scanner.nextInt();
        System.out.println(minRemoval(arr, k));
    }
    public static int minRemoval(int[] nums, int k) {
        Arrays.sort(nums);
        int left = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            while ((long)nums[left]*k<nums[i]) {
                left++;
            }
            max = Math.max(max,i-left+1);
        }
        return nums.length-max;
    }
}
