package Array;

public class Q1283 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 5, 9};
        System.out.println(smallestDivisor(nums, 6));
    }

    public static int smallestDivisor(int[] nums, int threshold) {
        int start = 1;
        int end = Integer.MIN_VALUE;
        for (int num : nums) {
            end = Math.max(end, num);
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;

            int curr = sum(nums, mid);
            if (curr <= threshold) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }

    private static int sum(int[] nums, int n) {
        int sum = 0;

        for (int num : nums) {
            sum += Math.ceil((double) num / (double) n);
        }

        return sum;
    }
}
