package Array;

public class Q485 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 1, 1, 1};

        System.out.println(findMaxConsecutiveOnes(nums));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int curr = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                curr++;
            } else {
                max = Math.max(max, curr);
                curr = 0;
            }
        }

        return Math.max(max, curr);
    }
}
