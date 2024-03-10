package Array;

public class Q209 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 2, 4, 3};
        System.out.println(minSubArrayLen(7, arr));
    }

    public static int minSubArrayLen(int target, int[] arr) {
        int minAns = Integer.MAX_VALUE;
        int i = 0;
        int j = 0;
        int sum = 0;

        while (j < arr.length) {
            sum += arr[j++];
            while (sum >= target) {
                minAns = Math.min(minAns, j - i);
                sum -= arr[i++];
            }
        }

        if (minAns == Integer.MAX_VALUE) {
            return 0;
        }

        return minAns;
    }
}
