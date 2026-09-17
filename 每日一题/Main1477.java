package 每日一题;

import java.awt.image.ImageProducer;
import java.util.*;

public class Main1477 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(minSumOfLengths(arr,target));

    }
    public static int minSumOfLengths(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int index = 0;
        int ans = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            while (sum > target) {
                sum -= arr[index];
                index++;
            }
            if (sum == target) {
                list.add(i - index + 1);
                sum -= arr[index];
                index++;
            }
        }
        Collections.sort(list);
        if (list.size() <= 1) {
            return -1;
        }
        ans = list.get(0)+list.get(1);
        return ans;
    }
}
