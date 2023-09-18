package Array;

public class Q136 {
    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};

        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {
        for(int i = 1; i < nums.length; i++){
            nums[0] ^= nums[i];
        }


        //to clean memory use System.gc();
        return nums[0];
    }
}
