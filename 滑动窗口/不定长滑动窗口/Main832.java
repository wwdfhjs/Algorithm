package 不定长滑动窗口;
//对于0或者1取反直接异或1；0 1=1  1 1=0
public class Main832 {
    public int[][] flipAndInvertImage(int[][] image) {
        for (int i=0;i<image.length;i++){
             int left=0;
             int right=image.length-1;
             while (left<right){
                 if(image[i][left]==image[i][right]){
                     image[i][left]=1^image[i][left];//image[i][left] ^= 1;
                     image[i][right]=1^image[i][right];//image[i][right] ^= 1;
                 }
                 left++;
                 right--;
             }
             if (left==right){
                 image[i][right]^=1;
             }
        }
        return image;
    }
}
