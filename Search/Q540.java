package Search;

public class Q540 {
    public static void main(String[] args) {
        int[] nums = {1,1,2,3,3,4,4,8,8};
        System.out.println(singleNonDuplicate(nums));
    }

    public static int singleNonDuplicate(int[] nums) {
        int ans = nums[0];
        for(int i=1;i<nums.length;i++){
            ans^=nums[i];
        }
        return ans;
    }
}
