package Search;

import java.util.Arrays;

public class Q34 {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        System.out.println(Arrays.toString(searchRange(nums, 8)));
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] ans = {first(nums,target),last(nums,target)};
        return ans;
    }

    static int first(int[] arr, int target){
        int s=0;
        int e=arr.length-1;
        int ans = -1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(arr[mid]== target){
                ans = mid;
                e-=1;
            }
            else if(arr[mid]<target) s=mid+1;
            else e=mid-1;
        }
        return ans;
    }

    static int last(int[] arr, int target){
        int s=0;
        int e=arr.length-1;
        int ans = -1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(arr[mid]== target){
                ans = mid;
                s+=1;
            }
            else if(arr[mid]<target) s=mid+1;
            else e=mid-1;
        }
        return ans;
    }
}
