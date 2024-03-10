package Array;

public class Q643 {
    public static void main(String[] args) {
        int[] nums = {1, 12, -5, -6, 50, 3};
        System.out.println(findMaxAverage(nums, 4));
    }

    public static double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        double avg = Integer.MIN_VALUE;
        int i = 0;
        int j = 0;

        while (j < nums.length) {
            sum += nums[j];

            if (j - i + 1 < k) {
                j++;
            } else {
                avg = Math.max(avg, (double) sum / k);
                sum -= nums[i];
                i++;
                j++;
            }
        }

        return avg;
    }
}
