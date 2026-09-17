package 定长滑动窗口;

public class Main2379 {
    public int minimumRecolors(String blocks, int k) {
         int ans=Integer.MAX_VALUE;
         int count=0;
         for(int i=0;i<blocks.length();i++){
             if (blocks.charAt(i)=='W'){
                 count++;
             }
             if (i<k-1){
                 continue;
             }
             ans=Math.min(ans,count);
             if (blocks.charAt(i-k+1)=='W'){
                 count--;
             }
         }
         return ans;
    }
}
