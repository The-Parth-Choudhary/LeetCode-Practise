package Maps;

import java.util.*;

public class Q350 {
    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        System.out.println(Arrays.toString(intersect(nums1, nums2)));
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> l = new ArrayList<>();

        for(int i=0;i<nums1.length;i++){
            map.put(nums1[i], map.getOrDefault(nums1[i],0)+1);
        }

        for(int i=0;i<nums2.length;i++){
            if(map.containsKey(nums2[i]) && map.get(nums2[i])>0){
                l.add(nums2[i]);
                map.put(nums2[i],map.get(nums2[i])-1);
            }
        }
        int[] arr = new int[l.size()];
        for(int i=0;i<l.size();i++){
            arr[i] = l.get(i);
        }
        return arr;
    }
}
