package String;

public class Q171 {
    public static void main(String[] args) {
        String columnTitle = "ZYA";

        System.out.println(titleToNumber(columnTitle));
    }

    public static int titleToNumber(String columnTitle) {
        int ans = 0;

        for (int i = 0; i < columnTitle.length(); i++) {
            ans *= 26;
            ans += columnTitle.charAt(i) - 'A' + 1;
        }

        return ans;
    }
}
