package StacksAndQueues;
import java.util.*;
public class Q2390 {
    public static void main(String[] args) {
        String s = "leet**cod*e";
        System.out.println(removeStars(s));
    }

    public static String removeStars(String s) {
        Stack<Character> st = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '*'){
                st.pop();
            }
            else{
                st.push(s.charAt(i));
            }
        }

        StringBuilder ans = new StringBuilder();

        while(!st.isEmpty()){
            ans.append(st.pop());
        }

        return ans.reverse().toString();
    }
}
