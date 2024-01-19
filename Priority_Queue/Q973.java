package Priority_Queue;

import javafx.util.*;

import java.util.*;

public class Q973 {
    public static void main(String[] args) {
        int[][] points = {{3, 3}, {5, -1}, {-2, 4}};
        System.out.println(Arrays.deepToString(kClosest(points, 2)));
    }

    public static int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Pair<int[], Integer>> maxHeap = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());

        for (int[] i : points) {
            maxHeap.add(new Pair<>(i, distance(i[0], i[1])));

            if (maxHeap.size() > k) {
                maxHeap.remove();
            }
        }

        int[][] ans = new int[k][2];
        int i = 0;
        while (!maxHeap.isEmpty()) {
            ans[i++] = maxHeap.remove().getKey();
        }

        return ans;
    }

    private static int distance(int x, int y) {
        return (x * x) + (y * y);
    }
}
