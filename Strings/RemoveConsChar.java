package JAVA_DSA.Strings;

import java.util.Scanner;

public class RemoveConsChar {
    public static String removeConsecutiveCharacter(String S){
        String res="";
        char[] c=S.toCharArray();
     
        for(int i=0;i<c.length-1;i++){
            if(c[i]!=c[i+1]){
                res=res+String.valueOf(c[i]);
            }
        }
      res=res+String.valueOf(c[c.length-1]);
      return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        sc.close();
        System.out.println(removeConsecutiveCharacter(s));
    }
}
