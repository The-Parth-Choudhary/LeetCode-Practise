package Array;

public class Q268 {
    public static void main(String[] args) {
        int[] nums = {9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(nums));
    }

    public static int missingNumber(int[] nums) {
        int sum = nums.length*(nums.length+1)/2;
        for(int i=0;i<nums.length;i++){
            sum -=nums[i];
        }
        return sum;
    }
}
