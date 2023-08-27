package StacksAndQueues;
import java.util.*;
public class Q1021 {
    public static void main(String[] args) {
        String s = "(()())(())(()(()))";
        System.out.println(removeOuterParentheses(s));
    }

    public static String removeOuterParentheses(String s) {
        String ans="";
        Stack<Character> st = new Stack<>();

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                if(!st.isEmpty()){
                    ans+=s.charAt(i);
                }
                st.push(s.charAt(i));
            }
            else{
                st.pop();
                if(!st.isEmpty()){
                    ans+=s.charAt(i);
                }
            }
        }
        return ans;
    }
}
