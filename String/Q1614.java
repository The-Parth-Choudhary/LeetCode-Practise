package String;

public class Q1614 {
    public static void main(String[] args) {
        String s = "(1+(2*3)+((8)/4))+1";
        System.out.println(maxDepth(s));
    }

    public static int maxDepth(String s) {
        int cnt = 0;
        int max = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                cnt++;
                max = Math.max(max, cnt);
            } else if (c == ')') {
                cnt--;
            }
        }

        return max;
    }
}
