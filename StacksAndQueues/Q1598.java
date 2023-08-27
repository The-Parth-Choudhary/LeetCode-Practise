package StacksAndQueues;
import java.util.*;
public class Q1598 {
    public static void main(String[] args) {
        String[] logs = {"d1/","d2/","../","d21/","./"};
        System.out.println(minOperations(logs));
    }

    public static int minOperations(String[] logs) {
        Stack<String> st = new Stack<>();

        for(int i = 0; i < logs.length; i++)
        {
            if(st.isEmpty() && logs[i].equals("../"))
            {
                continue;
            }
            else if(logs[i].equals("../"))
            {
                st.pop();
            }
            else if(logs[i].equals("./"))
            {
                continue;
            }
            else
            {
                st.push(logs[i]);
            }
        }

        return st.size();
    }
}
