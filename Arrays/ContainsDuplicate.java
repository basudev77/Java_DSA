package Arrays;

import java.util.Arrays;

public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        /*HashMap<Integer,Integer>mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        for(Integer a: mp.values()){
            if(a>1){
                return true;
            }
        }
        return false;*/
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1])
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {1,1,1,3,3,4,3,2,4,2};
        
        // Call the static method maxSubArray
        System.out.println(containsDuplicate(arr));
    }
}
