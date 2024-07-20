package Arrays;

import java.util.Arrays;
// This code return reapeated and missing number in a Array.

public class RepMissNumber {
    public static int[] repMissNumber(final int[] A) {
        long n = A.length; // size of the array
        // Find Sn and S2n:
        long SN = (n * (n + 1)) / 2;
        long S2N = (n * (n + 1) * (2 * n + 1)) / 6;

        // Calculate S and S2:
        long S = 0, S2 = 0;
        for (int i = 0; i < n; i++) {
            S += A[i];
            S2 += (long)A[i] * (long)A[i];
        }

        //S-Sn = X-Y:
        long val1 = S - SN;

        // S2-S2n = X^2-Y^2:
        long val2 = S2 - S2N;

        //Find X+Y = (X^2-Y^2)/(X-Y):
        val2 = val2 / val1;

        //Find X and Y: X = ((X+Y)+(X-Y))/2 and Y = X-(X-Y),
        // Here, X-Y = val1 and X+Y = val2:
        long x = (val1 + val2) / 2;
        long y = x - val1;

        int[] ans = {(int)x, (int)y};
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={3,1,2,5,3};
        int[] result = repMissNumber(arr);

        // Print the result using Arrays.toString()
        System.out.println(Arrays.toString(result));
    }
}
