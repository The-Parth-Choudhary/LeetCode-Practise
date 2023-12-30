package Trees;

import java.util.*;

public class Q501 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public int[] findMode(TreeNode root) {
        HashMap<Integer, Integer> map = new HashMap<>();
        helper(root, map);

        int max = Integer.MIN_VALUE;

        for (int a : map.values()) {
            max = Math.max(max, a);
        }

        int n = 0;

        for (int a : map.values()) {
            if (a == max) {
                n++;
            }
        }

        int[] ans = new int[n];
        int i = 0;

        for (int a : map.keySet()) {
            if (map.get(a) == max) {
                ans[i++] = a;
            }
        }

        return ans;
    }

    private void helper(TreeNode root, HashMap<Integer, Integer> map) {
        if (root == null) {
            return;
        }

        map.put(root.val, map.getOrDefault(root.val, 0) + 1);
        helper(root.left, map);
        helper(root.right, map);
    }
}
