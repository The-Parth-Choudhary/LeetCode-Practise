package StacksAndQueues;
import java.util.*;
public class Q71 {
    public static void main(String[] args) {
        String path = "/home//foo/";
        System.out.println(simplifyPath(path));
    }

    public static String simplifyPath(String path) {
        Stack<String> st = new Stack<>();
        String[] str = path.split("/");

        for(int i = 0; i < str.length; i++){
            if(!st.isEmpty() && str[i].equals("..")){
                st.pop();
            }
            else if(str[i].length() != 0 && (!str[i].equals("..") && !str[i].equals("."))){
                st.push(str[i]);
            }
        }

        if(st.isEmpty()){
            return "/";
        }

        StringBuilder ans = new StringBuilder();

        while(!st.isEmpty()){
            ans.insert(0, "/" + st.pop());
        }

        return ans.toString();
    }
}
