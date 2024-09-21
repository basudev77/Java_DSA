package Strings;

import java.util.Scanner;
import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
		for(int i=0;i<s.length();i++){
			char ch = s.charAt(i);
			if(ch=='(' || ch== '[' || ch=='{'){
				st.push(ch);
			}
			else if(st.isEmpty()==true){
				return false;
			}
			else if(ch==')' && st.pop()!='('){
				return false;
			}
			 else if(ch==']' && st.pop()!='['){
				return false;
			}
			 else if(ch=='}' && st.pop()!='{'){
				return false;
			}
		}
		return st.isEmpty();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        sc.close();
        System.out.println(isValid(s));
    }
}
