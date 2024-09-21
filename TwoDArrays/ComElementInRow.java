package TwoDArrays;
import java.util.*;
public class ComElementInRow {
    
    public static List<Integer> findCommonElements(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;

        Set<Integer> s = new HashSet<>();
        Map<Integer, Integer> mp = new HashMap<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                s.add(mat[i][j]);
            }

            for (int num : s) {
                mp.put(num, mp.getOrDefault(num, 0) + 1);
            }

            s.clear();
        }

        List<Integer> ans = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            if (entry.getValue() == n) {
                ans.add(entry.getKey());
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter row num:");
        int n = sc.nextInt();
        System.out.println("enter col num:");
        int m = sc.nextInt();
        int[][] matrix = new int[n][m];
        System.out.println("enter matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        List<Integer> ans = findCommonElements(matrix);

        for (int num : ans) {
            System.out.print(num + " ");
        }
        System.out.println();

        sc.close();
    }
}


