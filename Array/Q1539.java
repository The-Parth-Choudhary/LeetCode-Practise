package Array;

public class Q1539 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 7, 11};
        System.out.println(findKthPositive(arr, 5));
    }

    public static int findKthPositive(int[] arr, int k) {
        int left = 0;
        int right = arr.length -1;

        while(left <= right){
            int mid = left + (right-left)/2;

            if(arr[mid] - mid - 1 < k){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }

        return left+k;
    }

//    public static int findKthPositive(int[] arr, int k) {
//        int cnt = 0;
//        int ans = 1;
//        int idx = 0;
//        while (idx < arr.length && cnt < k) {
//            if (arr[idx] == ans) {
//                ans++;
//                idx++;
//            } else {
//                ans++;
//                cnt++;
//            }
//        }
//
//        while (cnt < k) {
//            ans++;
//            cnt++;
//        }
//        return ans - 1;
//    }
}
