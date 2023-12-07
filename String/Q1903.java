package String;

public class Q1903 {
    public static void main(String[] args) {
        System.out.println(largestOddNumber("35427"));
    }

    public static String largestOddNumber(String num) {
        int index = -1;

        for (int i = num.length() - 1; i >= 0; i--) {
            if ((num.charAt(i) - '0') % 2 == 1) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            return "";
        }

        return num.substring(0, index + 1);
    }
}
