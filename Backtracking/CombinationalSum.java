package Backtracking;
import java.util.*;

public class CombinationalSum {
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        findComSum(0,candidates,target,new ArrayList<>(),ans);
        return ans;
        
    }
    public static void findComSum(int idx,int[] arr, int target,List<Integer> ds,List<List<Integer>>ans){
        if(idx==arr.length){
            if(target==0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        if(arr[idx]<=target){
            ds.add(arr[idx]);
            findComSum(idx,arr,target-arr[idx],ds,ans);
            ds.remove(ds.size()-1);
        }
        findComSum(idx+1,arr,target,ds,ans);
    }
    public static void main(String[] args) {
        int[] arr={2,3,6,7};
        int target=7;
        List<List<Integer>> ans=combinationSum(arr,target);
        System.out.println(ans);
    }
}
