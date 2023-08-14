public class Q35 {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        System.out.println(searchInsert(nums, 5));
    }
    public static int searchInsert(int[] nums, int target) {
        int s=0;
        int e = nums.length-1;
        while(s<=e){
            int mid = s+ (e-s)/2;
            if(nums[mid]==target) return mid;
            else if(nums[mid]<target) s=mid+1;
            else e=mid-1;
        }
        return s;
    }
}
