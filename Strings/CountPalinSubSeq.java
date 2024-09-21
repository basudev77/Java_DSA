package Strings;

import java.util.Arrays;

public class CountPalinSubSeq {
    private static final int MOD = 1000000007;

    public static long countPS(String str) {
        int n = str.length();
        long[][] dp = new long[n][n];

        for (long[] row : dp) {
            Arrays.fill(row, -1);
        }

        return solve(dp, 0, n - 1, str);
    }

    private static long solve(long[][] dp, int i, int j, String str) {
        if (i > j) return 0;
        if (i == j) return 1;
        if (dp[i][j] != -1) return dp[i][j];

        if (str.charAt(i) == str.charAt(j)) {
            dp[i][j] = (1 + solve(dp, i + 1, j, str) + solve(dp, i, j - 1, str)) % MOD;
        } else {
            dp[i][j] = (solve(dp, i + 1, j, str) + solve(dp, i, j - 1, str) - solve(dp, i + 1, j - 1, str)+MOD) % MOD;
        }

        return dp[i][j];
    }
    public static void main(String[] args) {
        String str="abca";
        System.out.println(countPS(str));
    }
}
