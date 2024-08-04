package JAVA_DSA.Strings;
public class LongPalindromicSubStr {
    public static String longestPalindrome(String s) {
        int n = s.length();
        int maxlen = Integer.MIN_VALUE;
        int startingIndex = 0;
      

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (solve(s, i, j) && j - i + 1 > maxlen) {
                    startingIndex = i;
                    maxlen = j - i + 1;
                }
            }
        }

        return s.substring(startingIndex, startingIndex + maxlen);
    }

    private static boolean solve(String s, int l, int r) {
        while(l<=r){
            if(s.charAt(l)!=s.charAt(r))return false;
            l++;
            r--;
        }
        return true;
    }
    public static void main(String[] args) {
        String str="babad";
        System.out.println(longestPalindrome(str));
    }
}
