package Array;

public class Q1423 {
    public static void main(String[] args) {
        int[] cardPoints = {1, 2, 3, 4, 5, 6, 1};
        System.out.println(maxScore(cardPoints, 3));
    }

    public static int maxScore(int[] cardPoints, int k) {
        int i = 0;
        int j = 0;
        int sum = 0;
        int minSum = Integer.MAX_VALUE;
        int currSum = 0;

        if (cardPoints.length == k) {
            int ans = 0;

            for (i = 0; i < k; i++) {
                ans += cardPoints[i];
            }

            return ans;
        }

        while (j < cardPoints.length) {
            sum += cardPoints[j];
            currSum += cardPoints[j];
            if (j - i + 1 < cardPoints.length - k) {
                j++;
            } else {
                minSum = Math.min(minSum, currSum);
                currSum -= cardPoints[i];
                i++;
                j++;
            }
        }

        return sum - minSum;
    }
}
