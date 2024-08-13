package JAVA_DSA.Strings;
import java.util.*;
public class WordWrap {
    public static int solveWordWrap (int[] nums, int k)
    {
        int n = nums.length;
        int[] dp = new int[n+1];
        Arrays.fill(dp, Integer.MAX_VALUE); 
        dp[n] = 0;
        for(int i=n-1; i>=0; i--) {
            int sum = 0;
            for(int j=i; j<n && sum + nums[j]<=k; j++) {
                sum += nums[j];
                int spaces = (j != n-1) ? k-sum : 0;
                dp[i] = Math.min(dp[i], spaces*spaces+dp[j+1]);
                sum++;
            }
        } 
        return dp[0]; 
    }
    public static void main(String[] args) {
        int[]nums={3,2,2,5};
        int k = 6;
        System.out.println(solveWordWrap(nums, k));
    }
}
