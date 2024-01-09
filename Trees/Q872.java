package Trees;

import java.util.*;

public class Q872 {
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

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        getLeaf(root1, list1);
        getLeaf(root2, list2);

        if (list1.equals(list2)) {
            return true;
        }

        return false;
    }

    private void getLeaf(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }

        if (root.left == null && root.right == null) {
            list.add(root.val);
        }

        getLeaf(root.left, list);
        getLeaf(root.right, list);
    }
}
