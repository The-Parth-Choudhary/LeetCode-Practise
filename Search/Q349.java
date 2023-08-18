package Search;

import java.util.*;

public class Q349 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};

        System.out.println(Arrays.toString(intersection(nums1,nums2)));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> s1 = new HashSet<>();
        HashSet<Integer> s2 = new HashSet<>();

        for(int i=0;i<nums1.length;i++){
            s1.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            s2.add(nums2[i]);
        }

        ArrayList<Integer> l = new ArrayList<>();
        for(int i:s1){
            if(s2.contains(i)) l.add(i);
        }
        int[] ans = new int[l.size()];
        for(int i=0;i<l.size();i++){
            ans[i] = l.get(i);
        }
        return ans;
    }
}
