package Array;

public class Q2540 {
    public static void main(String[] args) {
        int[] nums1 = {11, 15, 28, 31, 36, 42, 46, 54, 58, 63, 64, 67, 75, 76, 76, 79, 83, 85, 87, 90};
        int[] nums2 = {3, 6, 8, 13, 15, 19, 22, 25, 29, 29, 32, 35, 43, 43, 48, 55, 81, 90, 91, 94};

        System.out.println(getCommon(nums1, nums2));
    }

    public static int getCommon(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums2[j] < nums1[i]) {
                j++;
            } else {
                return nums1[i];
            }
        }

        return -1;
    }
}
