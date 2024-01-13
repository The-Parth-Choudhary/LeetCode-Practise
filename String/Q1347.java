package String;

public class Q1347 {
    public static void main(String[] args) {
        String s = "leetcode";
        String t = "practice";

        System.out.println(minSteps(s, t));
    }

    public static int minSteps(String s, String t) {
        int[] freq = new int[26];

        for (int i = 0; i < s.length(); i++) {
            int c = s.charAt(i) - 'a';

            freq[c]++;
        }

        for (int i = 0; i < t.length(); i++) {
            int c = t.charAt(i) - 'a';
            freq[c]--;
        }

        int ans = 0;

        for (int i = 0; i < freq.length; i++) {
            ans += Math.abs(freq[i]);
        }

        return ans / 2;
    }
}
