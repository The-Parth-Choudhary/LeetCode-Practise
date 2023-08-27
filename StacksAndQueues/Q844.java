package StacksAndQueues;
import java.util.*;
public class Q844 {
    public static void main(String[] args) {
        String s1= "ab#c";
        String s2 = "ad#c";
        System.out.println(backspaceCompare(s1, s2));
    }

    public static boolean backspaceCompare(String s, String t) {
        Stack<Character> s1 = new Stack<>();
        Stack<Character> s2 = new Stack<>();

        for(int i=0;i<s.length();i++){
            if(s1.isEmpty() && s.charAt(i)=='#') continue;
            if(s.charAt(i)=='#'){
                s1.pop();
            }
            else s1.push(s.charAt(i));
        }

        for(int i=0;i<t.length();i++){
            if(s2.isEmpty() && t.charAt(i)=='#') continue;
            if(t.charAt(i)=='#'){
                s2.pop();
            }
            else s2.push(t.charAt(i));
        }

        if(s1.size() != s2.size()) return false;

        while(!s1.isEmpty() && !s2.isEmpty()){
            if(s1.pop() != s2.pop()) return false;
        }
        return true;
    }
}
