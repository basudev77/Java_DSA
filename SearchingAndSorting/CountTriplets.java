package SearchingAndSorting;
import java.util.*;
public class CountTriplets {
    static int arr[] = new int[]{5, 1, 3, 4, 7}; 
      
    static int countTriplets(int n, int sum) 
    { 
        // Sort input array 
        Arrays.sort(arr); 
       
        // Initialize result 
        int ans = 0; 
       
        for (int i = 0; i < n - 2; i++) 
        { 
            int j = i + 1, k = n - 1; 
       
            // Use Meet in the Middle concept 
            while (j < k) 
            { 
                if (arr[i] + arr[j] + arr[k] >= sum) 
                    k--; 
       
                // Else move left corner 
                else
                { 
                    ans += (k - j); 
                    j++; 
                } 
            } 
        } 
        return ans; 
    } 
       
    public static void main(String[] args)  
    { 
        int sum = 12;  
        System.out.println(countTriplets(arr.length, sum)); 
    } 
}
