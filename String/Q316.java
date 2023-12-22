package String;

import java.util.*;

public class Q316 {
    public static void main(String[] args) {
        String s = "cbacdcbc";
        System.out.println(removeDuplicateLetters(s));
    }

    public static String removeDuplicateLetters(String s) {
        int[] last = new int[26];

        for (int i = 0; i < s.length(); i++) {
            last[s.charAt(i) - 'a'] = i;
        }

        boolean[] visited = new boolean[26];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            int curr = s.charAt(i) - 'a';

            if (visited[curr] == true) {
                continue;
            }

            while (!stack.isEmpty() && stack.peek() > curr && i < last[stack.peek()]) {
                visited[stack.pop()] = false;
            }

            stack.push(curr);
            visited[curr] = true;
        }

        StringBuilder sb = new StringBuilder();

        while (!stack.isEmpty()) {
            sb.insert(0, (char) (stack.pop() + 'a'));
        }

        return sb.toString();
    }
}
