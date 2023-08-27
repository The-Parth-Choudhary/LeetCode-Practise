package StacksAndQueues;
import java.util.*;
public class Q496 {
    public static void main(String[] args) {
        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};
        System.out.println(Arrays.toString(nextGreaterElement(nums1, nums2)));
    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> s = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        s.push(-1);

        int[] ans = new int[nums1.length];

        for(int i=nums2.length-1;i>=0;i--){
            while(s.peek()!=-1 && s.peek()<=nums2[i]){
                s.pop();
            }
            map.put(nums2[i],s.peek());
            s.push(nums2[i]);
        }
        for(int i=0;i<nums1.length;i++){
            ans[i]=map.get(nums1[i]);
        }
        return ans;
    }
}
