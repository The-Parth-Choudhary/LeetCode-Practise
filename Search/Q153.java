package Search;

public class Q153 {
    public static void main(String[] args) {
        int[] nums = {3,4,5,1,2};
        System.out.println(findMin(nums));
    }

    public static int findMin(int[] nums) {
        int s=0;
        int e=nums.length-1;
        if(nums[s]<nums[e]) return nums[0];
        while(s<e){
            int mid = s+(e-s)/2;
            if(nums[mid]>nums[mid+1]) return nums[mid+1];
            else if(nums[mid]>nums[s]) s=mid+1;
            else e=mid;
        }
        return nums[s];
    }
}
