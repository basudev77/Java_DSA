package Strings;

import java.util.HashMap;
import java.util.Scanner;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
       if (s.length() != t.length()) return false;
        HashMap<Character,Integer>hm=new HashMap<>();
        for(int i=0;i<s.length();i++){
            hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
        }
        for(int j=0;j<t.length();j++){
            if(hm.getOrDefault(t.charAt(j),0)==0)return false;
            hm.put(t.charAt(j),hm.get(t.charAt(j))-1);
        }
        return true;           
     /* 
        if (s.length() != t.length()) return false;
        int alphas[] = new int[26];
        for(int i=0;i<s.length();i++){
            char sc=s.charAt(i);
            char tc=t.charAt(i);
            alphas[sc-'a']++;
            alphas[tc-'a']--;
        }
        
        for(int i : alphas){
            if(i != 0){
                return false;
            }
        }
        return true;
    */
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your 1st string: ");
        String strA=sc.nextLine();
        System.out.print("Enter your 2nd string: ");
        String strB=sc.nextLine();
        sc.close();
        System.out.println();
        System.out.println(isAnagram(strA,strB));
    }
}
