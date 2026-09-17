package 双向双指针;

import java.util.Scanner;

public class Main2105 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] plants = new int[n];
        for (int i = 0; i < n; i++) {
            plants[i] = sc.nextInt();
        }
        int capacityA=sc.nextInt();
        int capacityB=sc.nextInt();
        System.out.println(minimumRefill(plants,capacityA,capacityB));
    }
    public static int minimumRefill(int[] plants, int capacityA, int capacityB) {
        int left = 0, right = plants.length - 1;
        int a = capacityA, b = capacityB;
        int count = 0;

        while (left < right) {
            // Alice 处理 left
            if (a < plants[left]) {
                count++;
                a = capacityA;
            }
            a -= plants[left];
            left++;

            // Bob 处理 right
            if (b < plants[right]) {
                count++;
                b = capacityB;
            }
            b -= plants[right];
            right--;
        }

        // 中间只剩一棵植物
        if (left == right) {
            if (Math.max(a, b) < plants[left]) {
                count++;
            }
        }

        return count;
    }
}
