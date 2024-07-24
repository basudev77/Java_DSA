package JAVA_DSA.Arrays;

public class MinOfRotatedArray {
    public static int findMin(int[] num) {
        if (num == null || num.length == 0) {
            return 0;
        }
        int l=0;
        int r=num.length-1;
        while(l<r){
            int mid=l+(r-l)/2;
            if(num[mid]>num[r]){
                l=mid+1;
            }
            else{
                r=mid;
            }
        }
        return num[r];
    }
    public static void main(String[] args) {
        int arr[] = {3,4,5,1,2};
        
        // Call the static method maxSubArray
        System.out.println(findMin(arr));
    }
}
