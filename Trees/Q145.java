package Trees;

import java.util.*;

public class Q145 {
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

    public List<Integer> postorderTraversal(TreeNode root) {
        return helper(root, new ArrayList<Integer>());
    }

    private List<Integer> helper(TreeNode root, List<Integer> ans) {
        if (root == null) {
            return ans;
        }

        helper(root.left, ans);
        helper(root.right, ans);
        ans.add(root.val);

        return ans;
    }
}
