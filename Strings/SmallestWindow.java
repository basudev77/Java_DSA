package Strings;

import java.util.HashMap;
import java.util.Map;

public class SmallestWindow {
    public static String smallestWindow(String s, String p)
    {
        int n = s.length();

        if (p.length() > n)
            return "-1";

        Map<Character, Integer> mp = new HashMap<>();

        // store karliya
        for (char ch : p.toCharArray())
            mp.put(ch, mp.getOrDefault(ch, 0) + 1);

        int requiredCount = p.length();
        int i = 0, j = 0;

        int minWindowSize = Integer.MAX_VALUE;
        int start_i = 0;

        // story starts
        while (j < n) {
            char ch = s.charAt(j);

            if (mp.containsKey(ch) && mp.get(ch) > 0)
                requiredCount--;

            mp.put(ch, mp.getOrDefault(ch, 0) - 1);

            while (requiredCount == 0) {
                // start shrinking the window

                int currWindowSize = j - i + 1;

                if (minWindowSize > currWindowSize) {
                    minWindowSize = currWindowSize;
                    start_i = i;
                }

                char startChar = s.charAt(i);
                mp.put(startChar, mp.getOrDefault(startChar, 0) + 1);

                if (mp.containsKey(startChar) && mp.get(startChar) > 0) {
                    requiredCount++;
                }

                i++;
            }

            j++;
        }

        return minWindowSize == Integer.MAX_VALUE ? "-1" : s.substring(start_i, start_i + minWindowSize);
    
    }
    public static void main(String[] args) {
        String S = "timetopractice";
        String P = "toc";
        System.out.println(smallestWindow(S, P));
    }
}
