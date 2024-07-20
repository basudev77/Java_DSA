package Arrays;

public class TrapRainWater {
    public static int trap(int[] height) {
        int n=height.length;
        int[] leftmax=new int[n];
        leftmax[0]=height[0];
        for(int l=1;l<n;l++){
            leftmax[l]=Math.max(leftmax[l-1],height[l]);
        }
        int[] rightmax=new int[n];
        rightmax[n-1]=height[n-1];
        for(int r=n-2;r>=0;r--){
            rightmax[r]=Math.max(rightmax[r+1],height[r]);
        }
        int sum=0;
        for(int i=0;i<n;i++){
            int h=Math.min(leftmax[i],rightmax[i])-height[i];
            sum+=h;
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] height={4,2,0,3,2,5};
        System.out.println(trap(height));
    }
}
