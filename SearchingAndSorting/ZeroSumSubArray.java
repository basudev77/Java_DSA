package SearchingAndSorting;
import java.util.HashMap;

public class ZeroSumSubArray {
    public static long findSubarray(long[] arr, int n) {
        // Using HashMap with Long as the key type
        HashMap<Long, Integer> hm = new HashMap<>();
        long sum = 0;
        long count = 0;
        
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            
            // If sum is zero, increment count
            if (sum == 0) {
                count++;
            }
            
            // If sum is found in the map, it means there are subarrays with zero sum
            if (hm.containsKey(sum)) {
                count += hm.get(sum);
            }
            
            // Update the count of the current sum in the map
            hm.put(sum, hm.getOrDefault(sum, 0) + 1);
        }
        
        return count;
    }
    
    public static void main(String[] args) {
        long[] arr = {1, 2, 3, -3, -2, 1};
        int n = arr.length;
        System.out.println(findSubarray(arr, n)); // Should output 4
    }
}
