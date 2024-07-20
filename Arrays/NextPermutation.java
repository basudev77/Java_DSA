package Arrays;
import java.util.Arrays;

public class NextPermutation {

    public static int[] nextPer(int[] nums) {
        int n = nums.length;
        int index = -1;

        // Find the first decreasing element from the end
        for (int i = n - 1; i > 0; i--) {
            if (nums[i] > nums[i - 1]) {
                index = i - 1;
                break;
            }
        }

        if (index != -1) {
            // Find the element just larger than nums[index] to swap with
            for (int j = n - 1; j > index; j--) {
                if (nums[j] > nums[index]) {
                    // Swap nums[j] and nums[index]
                    int temp = nums[j];
                    nums[j] = nums[index];
                    nums[index] = temp;
                    break;
                }
            }
        }

        // Reverse the elements after index
        reverse(nums, index + 1, n - 1);
        return nums;
    }

    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 1, 2, 5};
        int[] result = nextPer(arr);

        // Print the result using Arrays.toString()
        System.out.println(Arrays.toString(result));
        
    }
}
