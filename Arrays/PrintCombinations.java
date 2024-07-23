package Arrays;

import java.util.Arrays;

public class PrintCombinations {
    public static void main(String[] args) {
        int arr[] = {1, 2, 1, 3, 1};
        int r = 3;
        int n = arr.length;
        printCombination(arr, n, r);
    }

    
    static void printArray(int data[], int r) {
        for (int i = 0; i < r; i++)
            System.out.print(data[i] + " ");
        System.out.println();
    }

    
    static void printCombination(int arr[], int n, int r) {
        
        int data[] = new int[r];
        Arrays.sort(arr);

        combinationUtil(arr, n, r, 0, data, 0);
    }

    static void combinationUtil(int arr[], int n, int r, int index, int data[], int i) {
    
        if (index == r) {
            printArray(data, r);
            return;
        }

        if (i >= n)
            return;

        
        data[index] = arr[i];
        combinationUtil(arr, n, r, index + 1, data, i + 1);

        // Remove duplicates
        while (i < n - 1 && arr[i] == arr[i + 1])
            i++;

        combinationUtil(arr, n, r, index, data, i + 1);
    }

}
