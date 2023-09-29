package Array;

public class Q896 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3};
        System.out.println(isMonotonic(nums));
    }

    public static boolean isMonotonic(int[] nums) {
        if(nums[0] <= nums[nums.length - 1]){
            for(int i = 1; i < nums.length; i++){
                if(nums[i] < nums[i - 1]){
                    return false;
                }
            }
        }
        else{
            for(int i = 1; i < nums.length; i++){
                if(nums[i] > nums[i - 1]){
                    return false;
                }
            }
        }

        return true;
    }
}
