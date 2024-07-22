
package Arrays;

public class MaxMinofArray {


    public static int findMin(int[] arr, int N) {
        if (N == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }
        
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int findMax(int[] arr, int N) {
        if (N == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }
        
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 9, 6, 5, 2, 3 };
        int N = arr.length;
        System.out.println("Minimum element is: " + findMin(arr, N));
        System.out.println("Maximum element is: " + findMax(arr, N));
    }
}
