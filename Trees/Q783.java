package Trees;

public class Q783 {
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

    int ans = Integer.MAX_VALUE;
    TreeNode prev = null;

    public int minDiffInBST(TreeNode root) {
        helper(root);

        return ans;
    }

    private void helper(TreeNode root) {
        if (root == null) {
            return;
        }

        helper(root.left);

        if (prev != null) {
            ans = Math.min(ans, root.val - prev.val);
        }

        prev = root;

        helper(root.right);
    }
}
