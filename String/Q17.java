package String;

import java.util.*;

public class Q17 {
    public static void main(String[] args) {
        System.out.println(letterCombinations("234"));
    }

    public static List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();

        if(digits.length() == 0){
            return ans;
        }

        StringBuilder output = new StringBuilder();
        int index = 0;

        String[] map = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        helper(digits, output, index, map, ans);

        return ans;
    }

    private static void helper(String digits, StringBuilder output, int index, String[] map, List<String> ans){
        if(index >= digits.length()){
            ans.add(new String(output));
            return;
        }

        int number = digits.charAt(index) - '0';
        String value = map[number];

        for(int i = 0; i < value.length(); i++){
            output.append(value.charAt(i));
            helper(digits, output, index + 1, map, ans);
            output.deleteCharAt(output.length() - 1);
        }
    }
}
