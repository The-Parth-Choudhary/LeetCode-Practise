package Array;

public class Q1011 {
    public static void main(String[] args) {
        int[] weights = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(shipWithinDays(weights, 5));
    }

    public static int shipWithinDays(int[] weights, int days) {
        int start = 0;
        int end = 0;

        for (int num : weights) {
            start = Math.max(start, num);
            end += num;
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (possible(weights, mid, days)) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }

    private static boolean possible(int[] weights, int n, int days) {
        int day = 1;
        int load = 0;

        for (int num : weights) {
            if (load + num <= n) {
                load += num;
            } else {
                day++;
                load = num;
            }
        }

        return day <= days;
    }
}
