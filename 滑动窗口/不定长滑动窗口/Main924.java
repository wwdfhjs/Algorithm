package 不定长滑动窗口;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main924 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []fruits=new int[n];
        for (int i = 0; i < n; i++) {
            fruits[i]=sc.nextInt();
        }
        System.out.println(totalFruit(fruits));
    }
    public static int totalFruit(int[] fruits) {
        Map<Integer, Integer> map = new HashMap<>();
        int index = 0;
        int ans = Integer.MIN_VALUE;
//        int count = 0;
        for (int i = 0; i < fruits.length; i++) {
            map.put(fruits[i], map.getOrDefault(fruits[i], 0) + 1);
            while (map.size() >2){
                map.put(fruits[index], map.getOrDefault(fruits[index], 0) - 1);
                if (map.get(fruits[index]) == 0){
                    map.remove(fruits[index]);
                }
                index++;
            }
            ans=Math.max(ans,i-index+1);
        }
        return ans;
    }
}
