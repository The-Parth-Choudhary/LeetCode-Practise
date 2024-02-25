package Recursion;

import java.util.*;

public class Q22 {
    public static void main(String[] args) {
        System.out.println(generateParenthesis(4));
    }

    public static List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        helper(n, 0, 0, new StringBuilder(), ans);
        return ans;
    }

    private static void helper(int n, int open, int close, StringBuilder str, List<String> ans) {
        if (open == n && close == n) {
            ans.add(str.toString());
            return;
        }

        if (open < n) {
            str.append('(');
            helper(n, open + 1, close, str, ans);
            str.deleteCharAt(str.length() - 1);
        }

        if (open > close) {
            str.append(')');
            helper(n, open, close + 1, str, ans);
            str.deleteCharAt(str.length() - 1);
        }
    }
}
