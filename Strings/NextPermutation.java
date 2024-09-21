package Strings;

import java.util.ArrayList;
import java.util.List;

public class NextPermutation {
    public static List<Integer> nextPermutation(int N, int arr[]){
        // code here
        int index=-1;
        for(int i=arr.length-1;i>0;i--){
            if(arr[i]>arr[i-1]){
                index=i-1;
                break;
            }
        }
        if(index!=-1){
            int j=arr.length-1;
            while(j>index){
                if(arr[j]>arr[index]){
                    int temp=arr[j];
                    arr[j]=arr[index];
                    arr[index]=temp;
                    break;
                }
                j--;
            }
        }
        rev(arr,index+1,arr.length-1);
        ArrayList<Integer>ans=new ArrayList<>();
        for(int k:arr){
            ans.add(k);
        }
        return ans;
    }
    public static int[] rev(int arr[],int start,int end){
        while(start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[]arr={1, 2, 3, 6, 5, 4};
        int n=arr.length;
        List<Integer>ans=nextPermutation(n, arr);
        for(int num:ans){
            System.out.print(num+" ");
        }
    }
}
