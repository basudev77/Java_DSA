package JAVA_DSA.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class MOsAlgorithm {
    static void printQuerySums(int[] a, int n, List<List<Integer>> q, int m) {
        // One by one compute sum of all queries
        for (int i = 0; i < m; i++) {
            // Left and right boundaries of current range
            int L = q.get(i).get(0);
            int R = q.get(i).get(1);
     
            // Compute sum of current query range
            int sum = 0;
            for (int j = L; j <= R; j++) {
                sum += a[j];
            }
     
            // Print sum of current query range
            System.out.println("Sum of [" + L + ", " + R + "] is " + sum);
        }
    }
     
    // Driver program
    public static void main(String[] args) {
        int[] a = {1, 1, 2, 1, 3, 4, 5, 2, 8};
        int n = a.length;
         
        List<List<Integer>> arr = new ArrayList<>();
        arr.add(Arrays.asList(1, 3));
        arr.add(Arrays.asList(0, 4)); // Example query
        arr.add(Arrays.asList(2, 6)); // Another example query
         
        int m = arr.size(); // Get the size of the list
        printQuerySums(a, n, arr, m);
    }
}
