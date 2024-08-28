package JAVA_DSA.SearchingAndSorting;

public class MinCostToMakeArrEqual {
    public static long minCost(int[] nums, int[] cost) {
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;

        for(int x:nums){
            min=Math.min(min,x);
            max=Math.max(max,x);
        }
        int l=min,r=max;
        long ans=Integer.MAX_VALUE;
        while(l<=r){
            int mid=l+(r-l)/2;
            long costForMid=findCost(mid,nums,cost);
            long costForMidPlusOne=findCost(mid+1,nums,cost);
            
            ans=Math.min(costForMid,costForMidPlusOne);
            if(costForMidPlusOne > costForMid){
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return ans;
    }
    public static long findCost(int mid,int[]nums,int[]cost){
        long res=0L;
        for (int i = 0; i < nums.length; i++) {
            // int diff=Math.abs(mid-nums[i]);
            // res+=(long)diff*cost[i];
            res+=(long)Math.abs(mid-nums[i])*cost[i];
        }
        return res;
    }
    public static void main(String[] args) {
        int[] nums = {1,3,5,2};
        int[] cost = {2,3,1,14};
        System.out.println(minCost(nums,cost));
    }
}
