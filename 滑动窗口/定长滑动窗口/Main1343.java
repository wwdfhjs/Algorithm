package 定长滑动窗口;

import java.util.Scanner;

public class Main1343 {
    public static void main(String[] args) {
        
    }
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int ans = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count += arr[i];
            if (i < k-1){
                continue;
            }
            if (count >= threshold * k ){
                ans++;
            }
            count -= arr[i-k+1];
        }
        return ans;
    }
}
