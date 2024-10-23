package Backtracking;

import java.util.ArrayList;

public class RatInaMaze {
    private static int[] di = {+1, 0, 0, -1};
    private static int[] dj = {0, -1, +1, 0};

    public static void solve(int[][] m, int n, int[][] vis, int i, int j, ArrayList<String> ars, String ref) {
        if (i == n - 1 && j == n - 1) {
            ars.add(ref);
            return;
        }

        String st = "DLRU";

        for (int l = 0; l < 4; l++) {
            int dc = i + di[l];
            int dd = j + dj[l];

            if (dc >= 0 && dd >= 0 && dc < n && dd < n && vis[dc][dd] == 0 && m[dc][dd] == 1) {
                vis[i][j] = 1;
                solve(m, n, vis, dc, dd, ars, ref + st.charAt(l));
                // backtracking
                vis[i][j] = 0;
            }
        }
    }

    public static ArrayList<String> findPath(int[][] mat) {
        ArrayList<String> ars = new ArrayList<>();
        int n=mat.length;
        int[][] visited = new int[n][n];
        String ref = "";

        if (mat[0][0] == 1) {
            solve(mat, n, visited, 0, 0, ars, ref);
        }

        if (ars.isEmpty()) {
            ars.add("-1");
        }

        return ars;
    }
    public static void main(String[] args) {
        int[][] mat = {{1, 0, 0, 0},
                {1, 1, 0, 1},
                {1, 1, 0, 0},
                {0, 1, 1, 1}};

        
        System.out.println(findPath(mat));
    }

}
