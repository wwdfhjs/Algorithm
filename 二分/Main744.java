import javafx.scene.transform.Scale;

import java.util.Scanner;

public class Main744 {
    public  static char nextGreatestLetter(char[] letters, char target) {
        int left = 0, right = letters.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (letters[mid] >= target) {
                right = mid - 1;
            }else {
                left = mid + 1;
            }
        }
        return letters[left];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] letters = sc.nextLine().toCharArray();
        System.out.println(nextGreatestLetter(letters, 'z'));
    }
}
