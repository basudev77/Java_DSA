package Strings;
public class LongCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        String res="";
        for(int i=0;i<strs[0].length();i++){
            char curr=strs[0].charAt(i);
            if(check(strs,curr,i))res+=curr;
            else break;
        }
        return res;
    }
    public static boolean check(String[] strs,char curr,int idx){
        for(int i=1;i<strs.length;i++){
            if(idx >= strs[i].length() || strs[i].charAt(idx) != curr) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String[] arr={"flower","flow","flight"};
        System.out.println(longestCommonPrefix(arr));
    }
}
