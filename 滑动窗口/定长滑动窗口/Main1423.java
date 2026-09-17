package 定长滑动窗口;

import java.util.Scanner;

public class Main1423 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(maxScore(arr, k));
    }
    public static int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int m = n - k;
        int s = 0;
        for (int i = 0; i < m; i++) {
            s += cardPoints[i];
        }

        int total = s;
        int minS = s;
        for (int i = m; i < n; i++) {
            total += cardPoints[i];
            s += cardPoints[i] - cardPoints[i - m];
            minS = Math.min(minS, s);
        }
        return total - minS;
    }
}
