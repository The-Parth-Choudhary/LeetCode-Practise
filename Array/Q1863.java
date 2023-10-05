package Array;

public class Q1863 {
    public static void main(String[] args) {
        int[] nums = {3,4,5,6,7,8};

        System.out.println(subsetXORSum(nums));
    }

    public static int subsetXORSum(int[] nums) {
        return helper(nums, 0, 0, 0);
    }

    private static int helper(int[] nums, int num, int index, int sum){
        sum += num;

        for(int i = index; i < nums.length; i++){
            num ^= nums[i];
            sum = helper(nums, num, i + 1, sum);
            num ^= nums[i];
        }

        return sum;
    }
}
