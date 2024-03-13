package Array;

public class Q1839 {
    public static void main(String[] args) {
        String word = "aeiaaioaaaaeiiiiouuuooaauuaeiu";
        System.out.println(longestBeautifulSubstring(word));
    }

    public static int longestBeautifulSubstring(String word) {
        int ans = 0;
        int i = 0;
        int j = 1;
        int cnt = 1;

        while (j < word.length()) {
            if (word.charAt(j - 1) <= word.charAt(j)) {
                if (word.charAt(j - 1) != word.charAt(j)) {
                    cnt++;
                }

                if (cnt == 5) {
                    ans = Math.max(ans, j - i + 1);
                }
            } else {
                i = j;
                cnt = 1;
            }
            j++;
        }

        return ans;
    }
}
