package String;

import java.util.HashMap;

public class Q1897 {
    public static void main(String[] args) {
        String[] words = {"abc", "aabc", "bc"};
        System.out.println(makeEqual(words));
    }

    public static boolean makeEqual(String[] words) {
        HashMap<Character, Integer> map = new HashMap<>();
        int n = words.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                char c = words[i].charAt(j);
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
        }

        for (char key : map.keySet()) {
            if (map.get(key) % n != 0) {
                return false;
            }
        }

        return true;
    }
}
