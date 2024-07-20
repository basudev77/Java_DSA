package Arrays;

import java.util.Arrays;

public class KthLargest {
    public static int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
    public static void main(String[] args) {
        int[] arr = { 4, 9, 6, 5, 2, 3 };
        System.out.println(findKthLargest(arr,2));
    }
}
