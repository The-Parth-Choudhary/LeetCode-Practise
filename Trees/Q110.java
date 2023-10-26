package Trees;

public class Q110 {
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

    class Pair {
        boolean b = true;
        int h = 0;
    }

    private Pair helper(TreeNode root) {
        if (root == null) {
            return new Pair();
        }

        Pair left = helper(root.left);
        Pair right = helper(root.right);

        boolean diff = Math.abs(left.h - right.h) <= 1;

        Pair ans = new Pair();
        ans.b = left.b && right.b && diff;
        ans.h = Math.max(left.h, right.h) + 1;

        return ans;
    }

    public boolean isBalanced(TreeNode root) {
        return helper(root).b;
    }
}
