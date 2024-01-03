package Array;

public class Q2125 {
    public static void main(String[] args) {
        String[] banks = {"011001", "000000", "010100", "001000"};
        System.out.println(numberOfBeams(banks));
    }

    public static int numberOfBeams(String[] bank) {
        int ans = 0;
        int last = 0;

        for (int i = 0; i < bank.length; i++) {
            int curr = 0;
            for (int j = 0; j < bank[i].length(); j++) {
                if (bank[i].charAt(j) - '0' == 1) {
                    curr++;
                }
            }

            if (curr != 0) {
                ans += last * curr;
                last = curr;
            }
        }

        return ans;
    }
}
