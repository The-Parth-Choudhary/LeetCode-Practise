package StacksAndQueues;
import java.util.*;
public class Q1544 {
    public static void main(String[] args) {
        String s = "leEeetcode";
        System.out.println(makeGood(s));
    }

    public static String makeGood(String s) {
        Stack<Character> st = new Stack<>();

        for(int i = 0; i < s.length(); i++)
        {
            if(!st.isEmpty() && (s.charAt(i)+32 == st.peek() || s.charAt(i)-32 == st.peek()))
            {
                st.pop();
            }
            else
            {
                st.push(s.charAt(i));
            }
        }

        StringBuilder string = new StringBuilder();

        while(!st.isEmpty())
        {
            string.append(st.pop());
        }

        String ans = string.reverse().toString();
        return ans;
    }
}
