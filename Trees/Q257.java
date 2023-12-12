package Trees;

import java.util.*;

public class Q257 {
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

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();

        helper(root, "", ans);

        return ans;
    }

    private void helper(TreeNode root, String str, List<String> ans) {
        if (root == null) {
            return;
        }

        str += root.val;

        if (root.left == null && root.right == null) {
            ans.add(str);
            return;
        }

        str += "->";

        helper(root.left, str, ans);
        helper(root.right, str, ans);
    }
}
