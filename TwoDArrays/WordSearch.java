package TwoDArrays;

public class WordSearch {
    private static int l, m, n;
    private static int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    
    private static boolean find(char[][] board, int i, int j, String word, int idx) {
        if (idx >= l) return true;
        if (i < 0 || i >= m || j < 0 || j >= n || board[i][j] != word.charAt(idx)) return false;
        
        char temp = board[i][j];
        board[i][j] = '$';  // Mark as visited
        
        for (int[] dir : directions) {
            int i_ = i + dir[0];
            int j_ = j + dir[1];
            if (find(board, i_, j_, word, idx + 1)) return true;
        }
        
        board[i][j] = temp;  // Restore the original value
        return false;
    }
    
    public static boolean exist(char[][] board, String word) {
        m = board.length;
        n = board[0].length;
        l = word.length();
        if (m * n < 1) return false;
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == word.charAt(0) && find(board, i, j, word, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        char[][] arr = {
            {'A', 'B', 'C', 'E'},
            {'S', 'F', 'C', 'S'},
            {'A', 'D', 'E', 'E'}
        };
        String word = "ABCCED";
        System.out.println(exist(arr, word));
    }
}
