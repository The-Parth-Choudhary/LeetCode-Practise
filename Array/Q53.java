package Array;

public class Q53 {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++)
        {
            if(sum < 0)
            {
                sum = 0;
            }

            sum += nums[i];

            max = Math.max(max, sum);
        }

        return max;
    }
}
