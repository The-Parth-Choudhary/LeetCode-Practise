package Trees;

import java.util.*;

public class Q230 {
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

    int K = 0;

    public int kthSmallest(TreeNode root, int k) {
        K = k;

        return helper(root);
    }

    private int helper(TreeNode root){
        if(root == null){
            return -1;
        }

        int left = helper(root.left);

        if(left == -1){
            if(--K == 0){
                return root.val;
            }
            return helper(root.right);
        }

        return left;
    }
}
