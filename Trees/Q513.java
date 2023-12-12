package Trees;

import java.util.*;

public class Q513 {
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

    public int findBottomLeftValue(TreeNode root) {
        int ans = root.val;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int size = q.size();

            for (int i = 0; i < size; i++) {
                TreeNode currNode = q.remove();
                ans = currNode.val;

                if (currNode.right != null) {
                    q.add(currNode.right);
                }
                if (currNode.left != null) {
                    q.add(currNode.left);
                }
            }
        }

        return ans;
    }
}
