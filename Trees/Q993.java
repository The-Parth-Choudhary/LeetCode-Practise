package Trees;

public class Q993 {
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

    public boolean isCousins(TreeNode root, int x, int y) {
        if (depth(root, x) != depth(root, y)) {
            return false;
        }

        return parent(root, null, x) != parent(root, null, y);
    }

    private int depth(TreeNode root, int x) {
        if (root == null) {
            return 0;
        }

        if (root.val == x) {
            return 1;
        }

        int left = depth(root.left, x);
        if (left != 0) {
            return left + 1;
        }

        int right = depth(root.right, x);
        if (right != 0) {
            return right + 1;
        }
        return 0;
    }

    private TreeNode parent(TreeNode root, TreeNode parent, int value) {
        if (root == null) {
            return null;
        }

        if (root.val == value) {
            return parent;
        }

        TreeNode left = parent(root.left, root, value);
        if (left != null) {
            return left;
        }

        return parent(root.right, root, value);
    }
}
