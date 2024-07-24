package JAVA_DSA.Arrays;

import java.util.*;

public class SubArraySumDivByK {
    public static int getLongestSubarray(int []nums, int k) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        mp.put(0,1);
        int prefix_sum=0;
        int count=0;
        for(int i=0; i<nums.length; i++){
            prefix_sum+=nums[i];
            int rem=prefix_sum % k;
            if(rem<0){
                rem=(rem+k);
            }
            if(mp.containsKey(rem)){
                count+=mp.get(rem);
                mp.put(rem,mp.get(rem)+1);
            }else{
                mp.put(rem,1);
            }

        }
        return count;
    }

    public static void main(String[] args) {
        int[] a = {2, 7, 6, 1, 4, 5};
        int k = 3;
        int len = getLongestSubarray(a, k);
        System.out.println("The length of the longest subarray is: " + len);
    }
}
