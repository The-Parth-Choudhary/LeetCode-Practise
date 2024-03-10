package Array;

public class Q1343 {
    public static void main(String[] args) {
        int[] arr = {11, 13, 17, 23, 29, 31, 7, 5, 2, 3};
        System.out.println(numOfSubarrays(arr, 3, 5));
    }

    public static int numOfSubarrays(int[] arr, int k, int threshold) {
        int cnt = 0;
        double sum = 0;
        int i = 0;
        int j = 0;

        while (j < arr.length) {
            sum += arr[j];

            if (j - i + 1 < k) {
                j++;
            } else {
                if (sum / k >= threshold) {
                    cnt++;
                }

                sum -= arr[i];
                i++;
                j++;
            }
        }

        return cnt;
    }
}
