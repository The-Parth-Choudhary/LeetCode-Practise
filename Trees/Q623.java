package Trees;

public class Q623 {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }
    }

    public static TreeNode addOneRow(TreeNode root, int val, int depth) {
        return helper(root, val, depth, 1);
    }

    private static TreeNode helper(TreeNode root, int val, int depth, int dir) {
        if (depth == 1) {
            TreeNode newNode = new TreeNode(val);
            if (dir == 1) {
                newNode.left = root;
            } else {
                newNode.right = root;
            }
            return newNode;
        }

        if (root == null) {
            return null;
        }

        root.left = helper(root.left, val, depth - 1, 1);
        root.right = helper(root.right, val, depth - 1, -1);

        return root;
    }
}
