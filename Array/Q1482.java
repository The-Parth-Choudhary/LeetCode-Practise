package Array;

public class Q1482 {
    public static void main(String[] args) {
        int[] bloomDay = {7, 7, 7, 7, 12, 7, 7};
        System.out.println(minDays(bloomDay, 2, 3));
    }

    public static int minDays(int[] bloomDay, int m, int k) {
        if (bloomDay.length < m * k) {
            return -1;
        }

        int left = Integer.MAX_VALUE;
        int right = Integer.MIN_VALUE;

        for (int i = 0; i < bloomDay.length; i++) {
            left = Math.min(left, bloomDay[i]);
            right = Math.max(right, bloomDay[i]);
        }

        int ans = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            int curr = canForm(bloomDay, mid, k);
            if (curr < m) {
                left = mid + 1;
            } else {
                ans = mid;
                right = mid - 1;
            }
        }

        return ans;
    }

    private static int canForm(int[] bloomDay, int day, int k) {
        int cnt = 0;
        int total = 0;

        for (int i = 0; i < bloomDay.length; i++) {
            if (day >= bloomDay[i]) {
                cnt++;
            } else {
                total += cnt / k;
                cnt = 0;
            }
        }
        total += cnt / k;

        return total;
    }
}
