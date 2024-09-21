package Arrays;

public class MaxSubArray {
    public static int maxSubArray(int[] nums) {
        int maxi = Integer.MIN_VALUE;
        int currMax = 0;
        for (int i = 0; i < nums.length; i++) {
            currMax += nums[i];
            if (currMax > maxi) {
                maxi = currMax;
            }
            if (currMax < 0) {
                currMax = 0;
            }
        }
        return maxi;
    }
    
    public static void main(String[] args) {
        int arr[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        
        // Call the static method maxSubArray
        System.out.println(maxSubArray(arr));
    }
}
