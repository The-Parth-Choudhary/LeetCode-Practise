package Trees;

import java.util.*;

public class Q437 {
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

    public int pathSum(TreeNode root, int targetSum) {
        return helper(root, targetSum, 0, new ArrayList<>());
    }

    private int helper(TreeNode root, int targetSum, long currsum, List<TreeNode> path) {
        if (root == null) {
            return 0;
        }

        path.add(root);
        currsum += root.val;

        int cnt = 0;
        long sum = 0;

        for (int i = path.size() - 1; i >= 0; i--) {
            sum += path.get(i).val;
            if (sum == targetSum) {
                cnt++;
            }
        }

        cnt += helper(root.left, targetSum, currsum, path);
        cnt += helper(root.right, targetSum, currsum, path);

        path.remove(path.size() - 1);
        currsum -= root.val;

        return cnt;
    }
}
