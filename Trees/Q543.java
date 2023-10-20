package Trees;

public class Q543 {
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
        int d = 0;
        int h = 0;
    }

    public int diameterOfBinaryTree(TreeNode root) {
        return diameter(root).d;
    }

    private Pair diameter(TreeNode root) {
        if (root == null) {
            return new Pair();
        }

        Pair left = diameter(root.left);
        Pair right = diameter(root.right);

        int op1 = left.d;
        int op2 = right.d;
        int op3 = left.h + right.h;

        Pair ans = new Pair();
        ans.d = Math.max(op1, Math.max(op2, op3));
        ans.h = Math.max(left.h, right.h) + 1;

        return ans;
    }
}
