package JAVA_DSA.Strings;

import java.util.Arrays;

public class PalinSubStrCount {
    static int[][] t;

    public static boolean checkP(String s, int i, int j) {
        if (i >= j) {
            return true;
        }

        if (t[i][j] != -1) {
            return t[i][j] == 1;
        }

        if (s.charAt(i) == s.charAt(j)) {
            boolean val = checkP(s, i+1, j-1);
            if(val == true)
                t[i][j] = 1;
            else
                t[i][j] = 0;
            return val;
        }

        t[i][j] = 0;
        return false;
    }

    public static int countSubstrings(String s) {
        int n = s.length();
        t = new int[n][n];
        for (int[] row : t) {
            Arrays.fill(row, -1);
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) { 
                if (checkP(s, i, j)) {
                    count++;
                }
            }
        }

        return count;
    }
    public static void main(String[] args) {
        String s="aaa";
        System.out.println(countSubstrings(s));
    }
}
