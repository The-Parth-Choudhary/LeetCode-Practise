package Array;

public class Q26 {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};

        int n = removeDuplicates(nums);

        for(int i = 0; i < n; i++){
            System.out.print(nums[i] +"  ");
        }
    }

    public static int removeDuplicates(int[] nums) {
        int cnt = 1;

        for(int i = 1; i < nums.length; i++){
            if(nums[i] != nums[i - 1]){
                nums[cnt++] = nums[i];
            }
        }

        return cnt;
    }
}
