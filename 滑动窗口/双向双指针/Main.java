package 双向双指针;

public class Main {
    public static void main(String[] args) {
        int num=1;
        int ans=0;
        while (num<=100){
            ans+=num;
            num++;
        }
        System.out.println(ans);
    }
}
