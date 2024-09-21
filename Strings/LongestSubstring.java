package Strings;

import java.util.HashMap;

public class LongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        int right, left = 0, max = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for(right = 0; right < s.length(); right++) {
            if(map.containsKey(s.charAt(right))) {
               max = Math.max(max, right - left);
               left = Math.max(left, map.get(s.charAt(right)) + 1); 
            }  
             map.put(s.charAt(right), right);
        }
        return Math.max(max, right - left);
    }
    public static void main(String[] args) {
        String s="basudevdas";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
