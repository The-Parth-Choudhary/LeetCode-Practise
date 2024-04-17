package Trees;

public class Q988 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public String smallestFromLeaf(TreeNode root) {
        StringBuilder ans = new StringBuilder();
        helper(root, new StringBuilder(), ans);
        return ans.toString();
    }

    private void helper(TreeNode root, StringBuilder curr, StringBuilder ans) {
        if (root == null) {
            return;
        }

        curr.append((char) ('a' + root.val));

        if (root.left == null && root.right == null) {
            String currStr = curr.reverse().toString();

            if (ans.length() == 0 || currStr.compareTo(ans.toString()) < 0) {
                ans.setLength(0);
                ans.append(currStr);
            }

            curr.reverse();
        }

        helper(root.left, curr, ans);
        helper(root.right, curr, ans);

        curr.setLength(curr.length() - 1);
    }
}
