package String;

import java.util.*;

public class Q1876 {
    public static void main(String[] args) {
        String s = "aababcabc";
        System.out.println(countGoodSubstrings(s));
    }

    public static int countGoodSubstrings(String s) {
        int i = 0;
        int j = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int cnt = 0;

        while (j < s.length()) {
            map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) + 1);

            if (j - i + 1 == 3 && map.size() == 3) {
                cnt++;
            }

            while (j - i + 1 > 3) {
                map.put(s.charAt(i), map.get(s.charAt(i)) - 1);

                if (map.get(s.charAt(i)) == 0) {
                    map.remove(s.charAt(i));
                }
                i++;

                if (j - i + 1 == 3 && map.size() == 3) {
                    cnt++;
                }
            }

            j++;
        }

        return cnt;
    }
}
