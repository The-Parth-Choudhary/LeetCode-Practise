package String;

import java.util.*;

public class Q791 {
    public static void main(String[] args) {
        String order = "bcafg";
        String s = "abcd";
        System.out.println(customSortString(order, s));
    }

    public static String customSortString(String order, String s) {
        StringBuilder ans = new StringBuilder();
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (int i = 0; i < order.length(); i++) {
            if (map.containsKey(order.charAt(i))) {
                ans.append(String.valueOf(order.charAt(i)).repeat(Math.max(0, map.get(order.charAt(i)))));
                map.remove(order.charAt(i));
            }
        }

        for (char c : map.keySet()) {
            ans.append(String.valueOf(c).repeat(Math.max(0, map.get(c))));
        }

        return ans.toString();
    }
}
