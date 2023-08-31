package Array;

public class Q287 {
    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};
        System.out.println(findDuplicate(nums));
    }

    public static int findDuplicate(int[] nums) {
        int i=0;
        while(i < nums.length){
            if(nums[i] != nums[nums[i]])
            {
                swap(nums, i, nums[i]);
            }
            else
            {
                i++;
            }
        }

        for(int j = 0; j < nums.length; j++){
            if(nums[j] != j){
                return nums[j];
            }
        }
        return -1;
    }

    static void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
