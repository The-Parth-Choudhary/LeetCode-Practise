package Search;

public class Q33 {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        System.out.println(search(nums, 0));
    }

    public static int search(int[] nums, int target) {
        int s=0;
        int e=nums.length-1;
        int peak=0;
        while(s<e){
            int mid=s+(e-s)/2;
            if(nums[mid]>nums[mid+1]){
                peak=mid;
                break;
            }
            else if(nums[mid]>nums[e]) s=mid+1;
            else e=mid;
        }

        int ans=binary(nums,target,0,peak);
        if(ans!=-1) return ans;
        return binary(nums,target,peak+1,nums.length-1);
    }

    static int binary(int[] nums, int target, int s, int e){
        int ans=-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target) s=mid+1;
            else e=mid-1;
        }
        return -1;
    }
}
