package String;

public class Q1750 {
    public static void main(String[] args) {
        String s = "aabccabba";
        System.out.println(minimumLength(s));
    }

    public static int minimumLength(String s) {
        int i = 0;
        int j = s.length() - 1;

        while (i < j && s.charAt(i) == s.charAt(j)) {
            char curr = s.charAt(i);

            while (i <= j && s.charAt(i) == curr) {
                i++;
            }
            while (i <= j && s.charAt(j) == curr) {
                j--;
            }
        }

        return j - i + 1;
    }
}
