package Array;

public class Q2706 {
    public static void main(String[] args) {
        int[] prices = {1, 2, 2, 3};
        System.out.println(buyChoco(prices, 4));
    }

    public static int buyChoco(int[] prices, int money) {
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int p : prices) {
            if (p < min1) {
                min2 = min1;
                min1 = p;
            } else if (min2 > p) {
                min2 = p;
            }
        }

        int left = money - (min1 + min2);

        if (left >= 0) {
            return left;
        }

        return money;
    }
}
