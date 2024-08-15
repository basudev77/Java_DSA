package JAVA_DSA.SearchingAndSorting;

public class CountingSort {
    public static int[] countSort(int[] inArray) {
        int N = inArray.length;
        int M = 0;

        for (int i = 0; i < N; i++) {
            M = Math.max(M, inArray[i]);
        }

        int[] countArray = new int[M + 1];

        for (int i = 0; i < N; i++) {
            countArray[inArray[i]]++;
        }

        for (int i = 1; i <= M; i++) {
            countArray[i] += countArray[i - 1];
        }

        int[] outArray = new int[N];

        for (int i = N - 1; i >= 0; i--) {
            outArray[countArray[inArray[i]] - 1] = inArray[i];
            countArray[inArray[i]]--;
        }

        return outArray;
    }

    public static void main(String[] args) {
        int[] inArray = {4, 3, 11, 2, 12, 1, 5, 5, 3, 9};
        int[] outArray = countSort(inArray);

        for (int i = 0; i < inArray.length; i++) {
            System.out.print(outArray[i] + " ");
        }
    }
}
