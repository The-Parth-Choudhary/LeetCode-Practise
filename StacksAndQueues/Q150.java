package StacksAndQueues;
import java.util.*;
public class Q150 {
    public static void main(String[] args) {
        String[] tokens = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        System.out.println(evalRPN(tokens));
    }

    public static int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();

        for(String s : tokens){
            if(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")){
                int b = st.pop();
                int a = st.pop();
                int res = calc(a, b, s.charAt(0));
                st.push(res);
            }
            else{
                st.push(Integer.parseInt(s));
            }
        }

        return st.pop();
    }

    private static int calc(int a, int b, char oprtr){
        if(oprtr == '+'){
            return a+b;
        }
        else if(oprtr == '-'){
            return a-b;
        }
        else if(oprtr == '*'){
            return a*b;
        }
        else{
            return a/b;
        }

    }
}
