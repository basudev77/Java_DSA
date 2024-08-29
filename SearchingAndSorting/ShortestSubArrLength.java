package JAVA_DSA.SearchingAndSorting;
public class ShortestSubArrLength {
    public static int findLengthOfShortestSubarray(int[] arr) {
        int n = arr.length;
        int i = 1, j = arr.length - 2, res = n;
        while(i < arr.length && arr[i - 1] <= arr[i]){
            i++;
        }
        if(i == arr.length){
            return 0;
        }
        while(j >= 0 && arr[j + 1] >= arr[j]){
            j--;
        }
        res = Math.min(n - i, j + 1);
        if(arr[0] > arr[arr.length - 1]){
            return res;
        }
        int p = 0, q = j + 1;
        while(p < i && q < n){
            if(arr[p] <= arr[q]){
                res = Math.min(res, q - p - 1);
                p++;
            }else{
                q++;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,10,4,2,3,5};
        System.out.println(findLengthOfShortestSubarray(arr));
    }
}
