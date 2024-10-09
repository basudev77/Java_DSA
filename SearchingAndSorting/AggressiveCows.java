package SearchingAndSorting;
import java.util.*;
public class AggressiveCows {
    static boolean isPossible(int arr[], int n, int cows, int mid) {
        int count = 1;
        int lastPos = arr[0];
        
        for (int i = 1; i < n; i++) {
            if (arr[i] - lastPos >= mid) {
                lastPos = arr[i];
                count++;
            }
            if (count == cows) {
                return true;
            }
        }
        
        return false;

    }
    static int findMinDistance(int[] arr, int n, int cows) {
        Arrays.sort(arr);
        int low = 0;
        int high = arr[n - 1] - arr[0];
        int res = -1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isPossible(arr, n, cows, mid)) {
                res = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 4, 9};
        int n = arr.length;
        int cows = 3;
        System.out.println(findMinDistance(arr, n, cows)); // Should output 3
    }
}
