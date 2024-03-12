package String;

import java.util.*;

public class Q2351 {
    public static void main(String[] args) {
        String s = "abccbaacz";
        System.out.println(repeatedCharacter(s));
    }

    public static char repeatedCharacter(String s) {
        Set<Character> set = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            if (set.contains(s.charAt(i))) {
                return s.charAt(i);
            } else {
                set.add(s.charAt(i));
            }
        }

        return ' ';
    }
}
