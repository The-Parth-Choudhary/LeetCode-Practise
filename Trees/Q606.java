package Trees;

public class Q606 {
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

    public String tree2str(TreeNode root) {
        StringBuilder ans = new StringBuilder();

        solve(root, ans);

        return ans.toString();
    }

    private void solve(TreeNode root, StringBuilder str) {
        if (root == null) {
            return;
        }

        str.append(String.valueOf(root.val));

        if (root.left != null) {
            str.append("(");
            solve(root.left, str);
            str.append(")");
        } else if (root.right != null) {
            str.append("()(");
            solve(root.right, str);
            str.append(")");

            return;
        }

        if (root.right != null) {
            str.append("(");
            solve(root.right, str);
            str.append(")");
        }

        return;
    }
}
