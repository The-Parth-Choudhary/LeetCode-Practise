package String;

public class Q1422 {
    public static void main(String[] args) {
        String s = "011101";

        System.out.println(maxScore(s));
    }

    public static int maxScore(String s) {
        int zero = 0;
        int one = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                zero++;
            } else {
                one++;
            }
        }

        int sum = 0;
        int leftZero = 0;
        int leftOne = 0;

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '0') {
                leftZero++;
            } else {
                leftOne++;
            }

            sum = Math.max(sum, leftZero + (one - leftOne));
        }

        return sum;
    }
}
