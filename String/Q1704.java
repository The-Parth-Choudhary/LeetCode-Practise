package String;

import java.util.*;

public class Q1704 {
    public static void main(String[] args) {
        String s = "textbook";

        System.out.println(halvesAreAlike(s));
    }

    public static boolean halvesAreAlike(String s) {
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');

        String firstHalf = s.substring(0, s.length() / 2);
        String secondHalf = s.substring(s.length() / 2);

        return countVowels(firstHalf, vowels) == countVowels(secondHalf, vowels);
    }

    private static int countVowels(String str, Set<Character> vowels) {
        int cnt = 0;

        for (char c : str.toCharArray()) {
            if (vowels.contains(c)) {
                cnt++;
            }
        }

        return cnt;
    }
}
