package Array;

import javafx.util.Pair;

import java.util.*;

public class Q1337 {
    public static void main(String[] args) {
        int[][] mat = {
                {1, 1, 0, 0, 0},
                {1, 1, 1, 1, 0},
                {1, 0, 0, 0, 0},
                {1, 1, 0, 0, 0},
                {1, 1, 1, 1, 1}
        };

        System.out.println(Arrays.toString(kWeakestRows(mat, 3)));
    }

    public static int[] kWeakestRows(int[][] mat, int k) {
        List<Pair<Integer, Integer>> list = new ArrayList<>();

        for (int i = 0; i < mat.length; i++) {
            int cnt = 0;

            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1) {
                    cnt++;
                }
            }

            list.add(new Pair<>(cnt, i));
        }

        int[] ans = new int[k];

        Collections.sort(list, (a, b) -> a.getKey() - b.getKey());

        for (int i = 0; i < k; i++) {
            ans[i] = list.get(i).getValue();
        }

        return ans;
    }
}
