package String;

import java.util.HashMap;

public class Q1358 {
    public static void main(String[] args) {
        String s = "abcabc";
        System.out.println(numberOfSubstrings(s));
    }

    public static int numberOfSubstrings(String s) {
        int i = 0;
        int j = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int ans = 0;

        while (j < s.length()) {
            map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) + 1);

            while (map.getOrDefault('a', 0) >= 1 && map.getOrDefault('b', 0) >= 1 && map.getOrDefault('c', 0) >= 1) {
                ans += (s.length() - j);

                map.put(s.charAt(i), map.get(s.charAt(i)) - 1);
                i++;
            }
            j++;
        }

        return ans;
    }
}
