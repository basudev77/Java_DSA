package SearchingAndSorting;
public class AllocateMinPages {
    public static long findPages(int n, int[] arr, int m) {
        // Your code here
        if(m>n)return -1;
        int sum=0;
        for(int i:arr){
            sum+=i;
        }
        int st=0,end=sum,ans=-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(isValid(arr,m,n,mid)){
                ans=mid;
                end=mid-1;
            }
            else{
                st=mid+1;
            }
        }
        return ans;
    }
    public static boolean isValid(int[] arr,int m,int n,int maxAllowedPg){
        int std=1,pages=0;
        for(int i=0;i<n;i++){
            if(arr[i]>maxAllowedPg){
                return false;
            }
            if(pages+arr[i]<=maxAllowedPg){
                pages+=arr[i];
            }
            else{
                std++;
                pages=arr[i];
            }
        }
        return std>m?false:true;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 4, 9};
        int n = arr.length;
        int cows = 3;
        System.out.println(findPages(n, arr, cows));  //output 11
    }
}
