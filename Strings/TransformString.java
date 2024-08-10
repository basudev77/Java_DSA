package JAVA_DSA.Strings;

import java.util.*;

public class TransformString{

    public static int transform(String A, String B) {
        // code here
        if (A.length() != B.length()) {
            return -1;
        }

        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        int n = A.length();
        for (int i = 0; i < n; i++) {
            hm.put(A.charAt(i),hm.getOrDefault(A.charAt(i),0)+1);
        }

        for (int i = 0; i < n; i++) {
            hm.put(B.charAt(i), hm.getOrDefault(B.charAt(i),0) - 1);
        }
        for (Character ch: hm.keySet()) {
            if (hm.get(ch) != 0)
                return -1;
        }

        int i = n - 1, j = n - 1;
        int res = 0;
        while (i >= 0 && j >= 0) {
            while (i >= 0 && A.charAt(i) != B.charAt(j)) {
                res++;
                i--;
            }
            i--;
            j--;
        }
        return res;
    }

    public static void main(String[] args)
    {
        String A = "EACBD";
        String B = "EABCD";
 
        System.out.println(
            "Minimum number of operations required is "
            + transform(A, B));
    }
}