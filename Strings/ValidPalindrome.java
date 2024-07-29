package JAVA_DSA.Strings;

import java.util.Scanner;

public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        int i=0,j=s.length()-1;
        s=s.toLowerCase();
        while(i<j){
            
            while(i<j && !((s.charAt(i)>='a' && s.charAt(i)<='z')|| (s.charAt(i)>='0' && s.charAt(i)<='9')))i++;
            while(i<j && !((s.charAt(j)>='a' && s.charAt(j)<='z')|| (s.charAt(j)>='0' && s.charAt(j)<='9')))j--;
            if(s.charAt(i)!=s.charAt(j))return false;
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your string: ");
        String str=sc.nextLine();
        sc.close();
        System.out.println(isPalindrome(str));
    }
}
