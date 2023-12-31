package String;

import java.util.*;

public class Q1624 {
    public static void main(String[] args) {
        String s = "xcbzxy";
        System.out.println(maxLengthBetweenEqualCharacters(s));
    }

    public static int maxLengthBetweenEqualCharacters(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int ans = -1;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (map.containsKey(c)) {
                ans = Math.max(ans, i - map.get(c) - 1);
            } else {
                map.put(c, i);
            }
        }

        return ans;
    }
}
