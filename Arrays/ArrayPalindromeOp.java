package JAVA_DSA.Arrays;

public class ArrayPalindromeOp {
    static int findMinOps(int[] arr, int n)
    {
        int ans = 0; // Initialize result

        // Start from two corners
        for (int i=0,j=n-1; i<=j;)
        {
            // If corner elements are same,
            if (arr[i] == arr[j])
            {
                i++;
                j--;
            }
            else if (arr[i] > arr[j])
            {
                j--;
                arr[j] += arr[j+1] ;
                ans++;
            }
            else
            {
                i++;
                arr[i] += arr[i-1];
                ans++;
            }
        }

        return ans;
    }

    public static void main(String[] args)
    {
        int arr[] = new int[]{1, 4, 5, 9, 1} ;
        System.out.println(findMinOps(arr, arr.length));
    }
}
