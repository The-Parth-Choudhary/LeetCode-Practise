package Trees;

public class Q1026 {
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

    int ans = 0;

    public int maxAncestorDiff(TreeNode root) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        helper(root, min, max);
        return ans;
    }

    private void helper(TreeNode root, int min, int max) {
        if (root == null) {
            return;
        }

        min = Math.min(min, root.val);
        max = Math.max(max, root.val);

        ans = Math.max(ans, max - min);

        helper(root.left, min, max);
        helper(root.right, min, max);

        return;
    }
}
