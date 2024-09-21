package Arrays;

public class MaxProduct {
    public static int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;;
        double prefix = 1;
        double suffix = 1;
        for(int i=0; i<nums.length; i++) {
            if(prefix == 0) prefix = 1;
            if(suffix == 0) suffix = 1;
            prefix = prefix * nums[i];
            suffix = suffix * nums[nums.length-i-1];
            max = Math.max(max, (int)Math.max(prefix, suffix));
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {2,3,-2,4};
        
        // Call the static method maxSubArray
        System.out.println(maxProduct(arr));
    }
}
