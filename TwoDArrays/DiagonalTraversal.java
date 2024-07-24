package JAVA_DSA.TwoDArrays;

public class DiagonalTraversal {
    public static int[] DiagonalPattern(int[][] matrix) {
        int n = matrix.length;
        int[] result = new int[n * n];
        int idx = 0;

        // Traverse the top row
        for (int j = 0; j < n; ++j) {
            int row = j;
            int col = 0;
            
            // Traverse the anti-diagonal
            while (col < n && row >= 0) {
                result[idx++] = matrix[row][col];
                row--;
                ++col;
            }
        }

        // Traverse the rightmost column (excluding the first element)
        for (int i = 1; i < n; ++i) {
            int col = i;
            int row = n - 1;
            
            // Traverse the anti-diagonal
            while (col < n && row >= 0) {
                result[idx++] = matrix[row][col];
                ++col;
                --row;
            }
        }

        return result;
    }

    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] M = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        int[] result = DiagonalPattern(M);
        printArray(result);
    }
}
